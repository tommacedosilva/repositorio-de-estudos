package com.qintess.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.qintess.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
	
	// definir campo para entitymanager
	private EntityManager entityManager;	
	
	// configurar constructor injection
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<Employee> findAll() {
		
		// obter a sessão atual do hibernate
		Session currentSession = entityManager.unwrap(Session.class);
		
		// criar a query
		Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class); 
		
		// executar a query e obter lista de resultados
		List<Employee> employees = theQuery.getResultList();
		
		// retornar os resultados
		return employees;
	}

	@Override
	public Employee findById(int theId) {
		
		// obter a sessão atual do hibernate
		Session currentSession = entityManager.unwrap(Session.class);
		
		// obter o employee
		Employee theEmployee = currentSession.get(Employee.class, theId);
		
		// retornar o employee
		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
		
		// obter a sessão atual do hibernate
		Session currentSession = entityManager.unwrap(Session.class);
		
		// salvar employee
		currentSession.saveOrUpdate(theEmployee);
		
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void deleteById(int theId) {
		
		// obter a sessão atual do hibernate
		Session currentSession = entityManager.unwrap(Session.class);
		
		// deletar objeto com a primary key
		Query theQuery = currentSession.createQuery("delete from Employee where id=:employeeId");
		
		theQuery.setParameter("employeeId", theId);
		
		theQuery.executeUpdate();
	}

}

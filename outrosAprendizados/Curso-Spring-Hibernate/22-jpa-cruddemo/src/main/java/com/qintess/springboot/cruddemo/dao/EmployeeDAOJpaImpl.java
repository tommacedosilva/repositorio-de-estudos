package com.qintess.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qintess.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findAll() {
		
		// criar query
		Query theQuery = entityManager.createQuery("from Employee");
		
		// executar query e obter lista de resultados
		List<Employee> employees = theQuery.getResultList();
		
		// retornar resultados		
		return employees;
	}

	@Override
	public Employee findById(int theId) {
		
		// obter employee
		Employee theEmployee = entityManager.find(Employee.class, theId);
				
		// retornar employee		
		return theEmployee;
		
	}

	@Override
	public void save(Employee theEmployee) {
		
		// salva ou atualiza o employee
		Employee dbEmployee = entityManager.merge(theEmployee);
		
		// atualiza com id do banco de dados para poder gerar id para salvar/inserir
		theEmployee.setId(dbEmployee.getId());
		
	}

	@Override
	public void deleteById(int theId) {
		
		// deletar objeto com primary key
		Query theQuery = entityManager.createQuery("delete from Employee where id=:employeeId");
		
		theQuery.setParameter("employeeId", theId);
		
		theQuery.executeUpdate();

	}

}

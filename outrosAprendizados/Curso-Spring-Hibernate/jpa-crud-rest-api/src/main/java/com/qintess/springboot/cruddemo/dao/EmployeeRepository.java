package com.qintess.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

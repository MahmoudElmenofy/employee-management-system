package com.my1projectspringboot.thymeleafdemo.service;

import com.my1projectspringboot.thymeleafdemo.entity.Employee;

import java.util.List;
//third layer (service layer) contain all business logic and connect with both second layer and fourth layer
public interface EmployeeService {

	List<Employee> findAll();
	//i want list contain all employee so this method will return list of employee
	Employee findById(int theId);
	//this method take employee id and return this employee
	void save(Employee theEmployee);
	//this method will add the new employee in the database
	void deleteById(int theId);
	//this method take employee id and delete this employee
}

package com.zim.springboot.thymeleafedemo.service;

import java.util.List;

import com.zim.springboot.thymeleafedemo.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}

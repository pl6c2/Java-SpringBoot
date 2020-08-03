package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.Model.Employee;
import com.example.repository.EmployeeRepository;

//@Component
@Service
public class EmployeeDAO {

	@Autowired
	EmployeeRepository employeerepository;
	
	
	public Employee save(Employee emp)
	{
		return employeerepository.save(emp);
	}
	
	public List<Employee> findAll()
	{
		return employeerepository.findAll();
	}
	
	public Optional<Employee> findOne(int id)
	{
		return employeerepository.findById(id);
	}
	
	public void delete(int id)
	{
	      employeerepository.deleteById(id);
	}

	public Optional<Employee> findOneByAbout(String about) {
		 return employeerepository.findOneByAbout(about);
	}

//	public Optional<Employee> findByAgeEquals(int ageEquals) {
//		
//		return employeerepository.findByAgeCountEquals(ageEquals);
//	}
}

package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Employee;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeDAO;

@Controller
@RequestMapping("/company")
public class EmployeeController {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Autowired
	private EmployeeRepository empr;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/addemployee")
	public List<Employee> addEmployee(@RequestBody Employee emp)
	{
		employeeDAO.save(emp);
		return employeeDAO.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getemployees")
	public List<Employee> getEmployees()
	{
		return employeeDAO.findAll();
	}
	
	@GetMapping("/hi")
	public String hi()
	{
		return "Hello dude";
	}
	
	@GetMapping("/getemployee/{id}")
	public Optional<Employee> getEmployee(@PathVariable(value="id") int id) 
	{
		return employeeDAO.findOne(id);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable(value="id") int id)
	{
		System.out.println("in spring boot"+id);
		 employeeDAO.delete(id);
		 return id+ " is deleted";
	}
	
	
	// /getrmployee/{id} and this one won't work at the same time
//	@GetMapping("/getemployee/{tittle}")
//	public Optional<Employee> getEmployeeByAbout(@PathVariable(value="tittle") String tittle) 
//	{
//		return employeeDAO.findOneByAbout(tittle.toString());
//	}
	
	
//	@GetMapping("/getemployee/age/{ageEqulas}")
//	public Optional<Employee> getEmployeeByAge(@PathVariable(value="ageEqulas") int ageEqulas) 
//	{
//		return employeeDAO.findByAgeEquals(ageEqulas);
//	}
	
	
//	@GetMapping("/getemployee/age")
//	public Optional<Employee> getEmployeeDESC() 
//	{
//		return empr.findByTopOrderByAgeCountDesc();
//	}
	
	@GetMapping("/getemployee/age/{age}")
	public Optional<Employee> getEmployeeAge(@PathVariable(value="age") int age) 
	{
		return empr.findOneByAbout(age);
	}
	
	
	
	
}

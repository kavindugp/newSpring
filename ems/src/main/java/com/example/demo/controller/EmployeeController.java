package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.modal.Address;
import com.example.demo.modal.Employee;
import com.example.demo.service.EmployeeService;

@RestController

@RequestMapping(value="/emscloud")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/employee",method = RequestMethod.POST)
	public Employee save (@RequestBody Employee employee)
	{
		return employeeService.save(employee);
		
		
		
	}
	
	@RequestMapping(value = "/test")
	public Employee test() {
		
		Employee employee=new Employee();
	    employee.setId(1);
	    employee.setName("Ama");
	 	Address address = new Address(); 
	    address.setAddress("Gamunupura");
	    address.setId(2);
	    address.setCity("Kaduwela");
	    employee.setAddress(address);
	    return employee;
		
		
	}
	
	
	@RequestMapping(value = "/test2")
	public ResponseEntity<Employee> test1() {
	Integer x=null;	
	if (x==null)
	{
		Employee employee=new Employee();
	    employee.setId(1);
	    employee.setName("Ama");
	 	Address address = new Address(); 
	    address.setAddress("Gamunupura");
	    address.setId(2);
	    address.setCity("Kaduwela");
	    employee.setAddress(address);
	    return ResponseEntity.ok(employee);
	}
	
	else {
	HttpHeaders httpHeaders = new HttpHeaders()	;
	httpHeaders.add("status", "invalid status");
	return ResponseEntity.notFound().headers(httpHeaders).build();
	}	
		
	
	
}
}

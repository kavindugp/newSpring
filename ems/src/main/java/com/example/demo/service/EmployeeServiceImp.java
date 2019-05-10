package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.modal.Employee;
import com.example.demo.modal.Telephone;

@Service
public class EmployeeServiceImp implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeerepository;

	@Override
	public Employee save(Employee employee) {
		
		
		for(Telephone telephone : employee.getTelephones()) {
			telephone.setEmployee(employee);
			}
		return employeerepository.save(employee);
	}

	
	
	
	
	
	

}

package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.demo.modal.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}

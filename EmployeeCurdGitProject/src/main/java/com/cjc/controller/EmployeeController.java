package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Employee;
import com.cjc.servicei.EmployeeServiceI;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceI  empser;
@PostMapping("/saveEmp")
	public String saveEmp(@RequestBody Employee employee)
	{
	
	     empser.saveEmployee(employee);
	       return"save Employee";
	}
@GetMapping("/getEmp")
public Iterable<Employee> getEmp()
{
Iterable<Employee> list =	empser.getAllEmployee();
	return  list;
}

@PutMapping("/updateEmployee")
public String updateEmployee(@RequestBody Employee emp)
{
	
	empser.saveEmployee(emp);
	return "Update Data";
	
}
@DeleteMapping("/deleteEmployee/{id}")
public String deleteData(@PathVariable int id)
{
	empser.deleteData(id);
	return "Employee Data Deleted";
	
}
	


}

package com.cjc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Employee;
import com.cjc.repository.EmployeeRepo;
import com.cjc.servicei.EmployeeServiceI;

@Service
public class EmployeeImpl implements EmployeeServiceI{
	@Autowired
  EmployeeRepo emprepo;
	@Override
	public void saveEmployee(Employee employee) {
	
	 emprepo.save(employee); 	
	}
	@Override
	public Iterable<Employee> getAllEmployee() {
		return emprepo.findAll();
		
	}

}

package com.cjc.servicei;

import com.cjc.model.Employee;

public interface EmployeeServiceI {

	public void saveEmployee(Employee employee);

	public Iterable<Employee> getAllEmployee();

}

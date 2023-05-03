package com.jcircle.dynamodb.service;

import com.jcircle.dynamodb.entity.Employee;

public interface IEmpService {

	public Employee save(Employee employee);

	public Employee getEmployeeId(String employeeId);

	public String deleteEmployee(String employeeId);

	public String updateEmployee(String employeeId, Employee empObj);

}

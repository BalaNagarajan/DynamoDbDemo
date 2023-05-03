package com.jcircle.dynamodb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcircle.dynamodb.entity.Employee;
import com.jcircle.dynamodb.repository.EmployeeRepository;
import com.jcircle.dynamodb.service.IEmpService;

@Service("empService")
public class EmpServiceImpl implements IEmpService {

	@Autowired
	private EmployeeRepository empRepository;

	public Employee save(Employee employee) {
		return empRepository.save(employee);
	}

	public Employee getEmployeeId(String employeeId) {
		return empRepository.getEmployeeId(employeeId);
	}

	public String deleteEmployee(String employeeId) {

		return empRepository.deleteEmployee(employeeId);
	}

	public String updateEmployee(String employeeId, Employee empObj) {
		return empRepository.updateEmployee(employeeId, empObj);
	}

}

package com.jcircle.dynamodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcircle.dynamodb.config.ApplicationConfig;
import com.jcircle.dynamodb.entity.Employee;
import com.jcircle.dynamodb.service.IEmpService;

@RestController
@RefreshScope
@EnableDiscoveryClient
@RequestMapping("/api/v1")
public class EmpController {

	@Autowired
	IEmpService empService;

	@Autowired
	ApplicationConfig applicationConfig;

	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employeeObj) {
		System.out.println(applicationConfig.getUserName());
		System.out.println(applicationConfig.getPassword());
		return empService.save(employeeObj);

	}

	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable("id") String employeeId) {
		return empService.getEmployeeId(employeeId);

	}

	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable("id") String employeeId) {
		return empService.deleteEmployee(employeeId);

	}

	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@PathVariable("id") String employeeId, @RequestBody Employee empObj) {
		return empService.save(empObj);

	}

}

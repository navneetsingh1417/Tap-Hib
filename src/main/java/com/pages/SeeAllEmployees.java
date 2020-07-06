package com.pages;

import java.util.List;

import org.apache.tapestry5.annotations.Property;

import com.model.Employee;
import com.model.EmployeeHold;
import com.services.EmployeeService;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

public class SeeAllEmployees {

	@Property
	private List<Employee> employees;
	
	@Property
	private Employee employee;

	@Inject
	private Session session;
	void setupRender() {
		this.employees = session.createCriteria(Employee.class).list();
	}
	
	
	
}

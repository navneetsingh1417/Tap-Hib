package com.pages;

import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;

import com.model.Employee;
import com.services.EmployeeService;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

public class AddEmployee {

	@Property
	private Integer id;
	
	@Property
	private Integer age;
	
	@Property
	private String name;
	
	@Property
	private String address;
	
	@Property
	private String username;
	
	@Property
	private String password;
	
	@InjectComponent("add")
	private Form form;

	@Inject
	private Session session;
	
	@CommitAfter
	Object onSuccess() {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setAge(age);
		emp.setName(name);
		emp.setUsername(username);
		emp.setPassword(password);
		emp.setAddress(address);
		System.out.println(emp);
		session.save(emp);
		return Dashboard.class;
	}
}

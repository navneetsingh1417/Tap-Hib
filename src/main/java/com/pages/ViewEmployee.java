package com.pages;

import org.apache.tapestry5.annotations.Property;

import com.model.Employee;
import com.services.EmployeeService;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class ViewEmployee {

	@Property
	private int id;
	
	void onActivate(int id) {
		this.id = id;
	}
	
	@Property
	private Employee employee;

	@Inject
	private Session session;
	
	void setupRender() {
		this.employee = (Employee) session.createCriteria(Employee.class)
											.add(Restrictions.eq("id",id))
											.list().get(0);
	}
	
	
}

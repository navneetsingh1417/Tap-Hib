package com.services;

import java.util.List;

import com.model.Employee;
import com.model.EmployeeHold;

public class EmployeeService {

	EmployeeHold empHold = new EmployeeHold();
	
	
	public Employee validateEmployee(String username,String password) {
		//List<Employee> employees = empHold.getAllEmp();
//		for(Employee i : employees) {
//			if(i.getUsername().equals(username) && i.getPassword().equals(password)) {
//				return i;
//			}
//		}
		return null;
	}
//
//	public List<Employee> getAll(){
//		//return empHold.getAllEmp();
//	}
	
	//public void addEmployee(Employee e) {
//		empHold.addEmp(e);
//	}
	
	public Employee findById(int id) {
//		List<Employee> employees = empHold.getAllEmp();
//		for(Employee i: employees) {
//			if(i.getId() == id) {
//				return i;
//			}
//		}
		return null;
	}
}

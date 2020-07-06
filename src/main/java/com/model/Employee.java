package com.model;

import org.apache.tapestry5.beaneditor.NonVisual;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@Column(name="id")
	private int id;

	@Column(name="age")
	private int age;

	@Column(name="name")
	private String name;

	@Column(name="address")
	private String address;

	@Column(name="username")
	private String username;

	@Column(name="password")
	private String password;




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", age=" + age +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}

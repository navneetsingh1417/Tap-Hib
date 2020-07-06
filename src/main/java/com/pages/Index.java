package com.pages;


import org.apache.log4j.lf5.PassingLogRecordFilter;
import org.apache.tapestry5.Block;
import org.apache.tapestry5.EventContext;
import org.apache.tapestry5.PersistenceConstants;
import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Log;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.PasswordField;
import org.apache.tapestry5.corelib.components.TextField;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Autobuild;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.ioc.annotations.Symbol;
import org.apache.tapestry5.services.HttpError;
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;

import com.model.Employee;
import com.services.EmployeeService;
import sun.reflect.annotation.ExceptionProxy;

import java.lang.reflect.Member;
import java.util.Date;
import java.util.List;

import javax.annotation.Nullable;

/**
 * Start page of application Tap22.
 */
public class Index
{
	
	@Property
	private String username;
	
	@Property
	private String password;
	
	@InjectComponent("login")
	private Form form;
	
	@InjectComponent(value = "username")
	private TextField usernameField;
	
	@InjectComponent(value = "password")
	private PasswordField passwordField;

	@Inject
	private Session session;
	

	
	// Validating the user
	@CommitAfter
	void onValidateFromLogin() {
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("username",username));
		criteria.add(Restrictions.eq("password",password));
		List results = criteria.list();
		System.out.println(results.size());
		if(results.size() == 0){
			form.recordError(usernameField,"incorrect username");
			form.recordError(passwordField,"incorrect password");
		}
	}
	
	// Validation Passed
	Object onSuccess() {
		return Dashboard.class;
	}
	
}

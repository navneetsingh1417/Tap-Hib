package com.pages;

import org.apache.tapestry5.PersistenceConstants;
import org.apache.tapestry5.alerts.AlertManager;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.PasswordField;
import org.apache.tapestry5.corelib.components.TextField;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.slf4j.Logger;

public class Login
{


  @Property
  private String email;

  @Property
  private String password;
  
  @Property()
  private String message;


  

  Object onValidateFromLogin()
  {
    if ( !email.equals("abc@gmail.com") && !password.equals("123")) {
    	message = "Incorrect Credentials ";
    	return Login.class;
    }else {
    	return Dashboard.class;
    }
  }

//  Object onSuccessFromLogin()
//  {
//    
//
//    return Dashboard.class;
//  }
//
//  Object onFailureFromLogin()
//  {
//    return Login.class;
//  }

}

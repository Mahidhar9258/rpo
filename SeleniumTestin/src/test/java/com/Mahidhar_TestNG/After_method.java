package com.Mahidhar_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class After_method {
	@BeforeMethod
	  public void login() {
		  System.out.println("This is login application");
		   System.out.println("This is login change of application");
	  }
	  @Test
	  public void Senddata() {
		  System.out.println("We need to send data");
	  }
	  @Test
	  public void click_element() {
		  System.out.println("click on the element");
	  }
	  @Test
	  public void Search_bar() {
		  System.out.println("enter msg in  search box");
	  }
	  @AfterMethod
	  public void logout() {
		  System.out.println("logout application");
	  }
}

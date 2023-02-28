package com.Mahidhar_TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_MEthod {
	@BeforeMethod
	  public void login() {
		  System.out.println("This is login application");
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
	  @Test
	  public void logout() {
		  System.out.println("logout application");
	  }
}

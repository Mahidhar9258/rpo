package com.Mahidhar_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class After_class {
	@BeforeClass
	  public void login() {
		  System.out.println("This is login application");
		  System.out.println("This is login change application");
	  }
	  @Test
	  public void Senddata() {
		  System.out.println("We need to send data");
		  System.out.println("This is login change application");
	  }
	  @Test
	  public void click_element() {
		  System.out.println("click on the element");
	  }
	  @Test
	  public void Search_bar() {
		  System.out.println("enter msg in  search box");
	  }
	  @AfterClass
	  public void logout() {
		  System.out.println("logout application");
	  }

}

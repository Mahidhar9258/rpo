package com.Mahidhar_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_browsing {
	WebDriver driver;
	@BeforeMethod
	@Parameters("browsers")
	public void Cross_browser(String browser) 
	{
		switch (browser.toLowerCase()) 
		{
		case "chrome":
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\mahid\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("thi sis");
			break;
		case "edge":
			System.setProperty("Webdriver.edge.driver", "C:\\Users\\mahid\\OneDrive\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		    driver = new EdgeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			break;
			default:
				driver = null;
			break;
			
		}
		
		
	}
	@Test
public void Get_title() {
	String title = driver.getTitle();
	System.out.println(title);
}
	@Test
public void senddata() {
	Actions actobj = new Actions(driver);
	WebElement we = driver.findElement(By.id("twotabsearchtextbox"));
	actobj.sendKeys(we, "selenium").build().perform();
	actobj.sendKeys(Keys.ENTER).perform();
}
	@AfterMethod
public void tear_down() {
	driver.quit();
}
}

package com.qa.opencart.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFractory;
import com.qa.opencart.pages.LoginPage;

public class BaseTest {
	DriverFractory driverfactory;
	Properties prop;
	WebDriver driver;
	LoginPage loginpage;
	
	@BeforeTest
	public void setup() {
		driverfactory=new DriverFractory();
		prop=driverfactory.initProperties();
		driver=driverfactory.initDriver(prop);
		loginpage=new LoginPage(driver);
	}
	
	@AfterTest
	public void teardown() {
	driver.quit();
	}
	
	

}

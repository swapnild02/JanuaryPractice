package com.qa.opencart.test;

import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
	@Test
	public void login() {
		loginpage.doLoginIn(prop.getProperty("username"), prop.getProperty("password"));
		
	}

}

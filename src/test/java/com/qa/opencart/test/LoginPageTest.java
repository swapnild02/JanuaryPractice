package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.utility.ConstantsOpenCart;

public class LoginPageTest extends BaseTest {
	@Test(priority=2)
	public void login() {
		loginpage.doLoginIn(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void verifyLoginTitle() {
		String title=loginpage.loginTitle();
		System.out.println("Title of login page is " +title);
		Assert.assertEquals(title, ConstantsOpenCart.LOGIN_PAGE_TITLE);
	}

}

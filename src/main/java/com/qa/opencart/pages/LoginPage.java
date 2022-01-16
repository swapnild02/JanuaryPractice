package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utility.ElementUtility;

public class LoginPage  {
	WebDriver driver;
	ElementUtility elementutility;
	
	By username_txt=By.id("input-email");
	By password_txt=By.id("input-password");
	By login_btn=By.className("btn-primary");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		elementutility=new ElementUtility(driver);
	}
	
	
	
	public void username(String username) {
		elementutility.sendText(username_txt, username);
		
	}
	public void password(String password) {
		
		elementutility.sendText(password_txt, password);
		
	}
	public void clickLogin() {
		
		elementutility.click(login_btn);
		
	}
	
	public void doLoginIn(String username,String password) {
		username(username);
		password(password);
		clickLogin();
	}
	
	public String loginTitle() {
		return elementutility.getTitle();
	}

}

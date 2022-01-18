package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utility.ElementUtility;

public class AccountPage {
	
	private ElementUtility elementutility;
	private WebDriver driver;
	
	By logoutlink=By.linkText("Logout");
	
	public AccountPage(WebDriver driver) {
		this.driver=driver;
		elementutility=new ElementUtility(driver);
	}
	
	public boolean islogoutlinkDisplayed() {
		return elementutility.isDisplayed(logoutlink);
	}

}

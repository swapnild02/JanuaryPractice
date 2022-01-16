package com.qa.opencart.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtility {
	
	 WebDriver driver;
	
	public ElementUtility(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> findElements(By locator) {
		return driver.findElements(locator);
	}
	
	public void sendText(By locator, String text) {
		findElement(locator).sendKeys(text);
	}
	
	public void click(By locator) {
		findElement(locator).click();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}


}

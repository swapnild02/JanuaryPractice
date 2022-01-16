package com.qa.opencart.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFractory {
	
	ThreadLocal<WebDriver> tldriver=new ThreadLocal<WebDriver>();
	Properties prop;
	
	
	public WebDriver initDriver(Properties prop) {
		String browserName=prop.getProperty("browsername");
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			tldriver.set(new ChromeDriver());
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tldriver.set(new FirefoxDriver());
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			tldriver.set(new EdgeDriver());
		}
		else {
			System.out.println("Please assigned correct browser name");
		}
		geturl();
		return getDriver();
		
	}
	
	public WebDriver getDriver() {
		return tldriver.get();
	}
	
	public Properties initProperties() {
		prop=new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("./src/test/resources/configuration/qa.config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
		
		
	}
	
	public void geturl() {
		getDriver().get(prop.getProperty("url"));
	}
	

}

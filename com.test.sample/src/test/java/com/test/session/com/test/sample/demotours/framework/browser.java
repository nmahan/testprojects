package com.test.session.com.test.sample.demotours.framework;

import org.openqa.selenium.chrome.ChromeDriver;

public class browser extends selhelper{
	
public static void Openbrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();

}

public static void Closebrowser() {
	
	driver.quit();
}

}
package com.test.session.com.test.sample.demotours.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.session.com.test.sample.demotours.framework.selhelper;


public class login extends selhelper {
	
	 public static void Login() {
	driver.findElement(By.name("userName")).sendKeys("mercury");
	driver.findElement(By.name("password")).sendKeys("mercury");
	driver.findElement(By.name("login")).click();
	
}
	 
	 public static void alllinks() {
		 
		 List<WebElement> links = driver.findElements(By.cssSelector("a"));
		  
		 for(int i=0;i<links.size();i++) {
			 
			 String linkname = links.get(i).getText();
			 System.out.println(linkname);
			 
			 /*if(linkname.contains("Vacations")) {
				 links.get(i).click();
				 break;
				 
			 }*/
	 }
	 }
}

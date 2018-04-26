package com.test.session.com.test.sample.demotours.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.session.com.test.sample.demotours.framework.selhelper;

public class flightdetails extends selhelper {
	
	public static void Flightdetails() {	
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select")).sendKeys("New York");
		driver.findElement(By.name("toPort")).sendKeys("London");
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")).click();
		
	}
	
	
	public static void selectradiobutton() {
		
		List<WebElement> radiovalues = driver.findElements(By.cssSelector("input"));
		for(int i=0; i<radiovalues.size();i++) {
			System.out.println(i);
			String actualvalue = radiovalues.get(i).getAttribute("value");
			System.out.println(actualvalue);
			
			if(actualvalue.contains("First"));
			 radiovalues.get(i).click();
			 break;
			
			
		}
		
		
	}
	
	
	
}



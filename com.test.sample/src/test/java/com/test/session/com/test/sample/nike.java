package com.test.session.com.test.sample;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class nike {
	
	public static WebDriver driver;
	
	
	public static void Openbrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.nike.com/us/en_us/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".nsg-glyph--cart")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//span[text()='JOIN']")).click();

			
}
	
	public static void Register() {
		
		driver.findElement(By.xpath("//input[@data-componentname='emailAddress']")).sendKeys("nmahan0506@gmail.com");
		driver.findElement(By.xpath("//input[@data-componentname='passwordCreate']")).sendKeys("Don123456");
		driver.findElement(By.xpath("//input[@data-componentname='firstName']")).sendKeys("don");
		driver.findElement(By.xpath("//input[@data-componentname='lastName']")).sendKeys("maha");
		driver.findElement(By.xpath("//input[@data-componentname='dateOfBirth']")).sendKeys("05/06/1992");
		driver.findElement(By.xpath("//span[text()='Male']")).click();
		driver.findElement(By.xpath("//input[@value='CREATE ACCOUNT']")).click();
		
		
	}
	
	
public static void main(String[] args) {
	 
	Openbrowser();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Register();
}
}
package com.test.session.com.test.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailaccount {
	
	public static WebDriver driver;
	
	
public static void Openbrowser() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com/gmail/about/#");
	driver.manage().window().maximize();
	
}

public static void Createaccount() {
	
	driver.findElement(By.xpath("/html/body/nav/div/a[3]")).click();
	driver.findElement(By.className("firstName")).sendKeys("den");
	driver.findElement(By.className("lastName")).sendKeys("mark");
	driver.findElement(By.className("Username")).sendKeys("denm07882");
	driver.findElement(By.className("Password")).sendKeys("mar_123456");
	driver.findElement(By.className("Confirm password")).sendKeys("mar_123456");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/form/div[2]/div/div[2]/div[1]/div/content")).click();	
}

	
	
	

	public static void main(String[] args) {
		
		Openbrowser();
		Createaccount();
		

	}

}

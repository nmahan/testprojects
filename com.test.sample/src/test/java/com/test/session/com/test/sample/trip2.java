package com.test.session.com.test.sample;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;




public class trip2 {
		public static WebDriver driver;
      public static void testcase2() {

		
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			driver.get("http://newtours.demoaut.com/");
			
			driver.manage().window().maximize();

			driver.findElement(By.name("userName")).sendKeys("dhjcdsh");

			driver.findElement(By.name("password")).sendKeys("hbdhfdh");

			driver.findElement(By.name("login")).click();
			
		


		}

		

		public static void main(String[] args) {

			

			testcase2();
		}



	}



package com.test.session.com.test.sample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test_testngexample {
		
		@BeforeMethod
		public void A() {
			
			 System.out.println("abc");
		}
		@Test
		public void B() {
			
			System.out.println("123");

		}
		@Test
		public void E() {
			
			System.out.println("456");

		}
		
		@AfterMethod
	   public void D() {
		
		  System.out.println("donald");
	}
		
		
		
	}




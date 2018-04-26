package com.test.session.com.test.sample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngexample {
	
	
	@BeforeMethod
	public void A() {
		
		 System.out.println("mahan");
	}
	@Test
	public void B() {
		
		System.out.println("sunny");

	}
	@Test
	public void E() {
		
		System.out.println("cva");

	}
	
	@AfterMethod
   public void D() {
	
	  System.out.println("vinnu");
}
	
	
	
}

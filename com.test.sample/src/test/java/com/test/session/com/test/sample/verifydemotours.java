package com.test.session.com.test.sample;

import org.testng.annotations.Test;

public class verifydemotours extends Demotours{
	static Demotours dt = new Demotours();
	
	
	@SuppressWarnings("static-access")
	@Test
	public void crosscheck() {
		
		dt.Openbrowser();
		dt.Login("mercury","mercury");
		dt.Flightdetails();
		dt.SelectFlight();
		dt.Bookflight("rao","maha","123456789");
		dt.Logout();
		dt.Closebrowser();
		
		
	}
	

	
}

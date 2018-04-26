package com.test.session.com.test.sample;

import com.test.session.com.test.sample.demotours.framework.browser;
import com.test.session.com.test.sample.demotours.pages.bookflight;
import com.test.session.com.test.sample.demotours.pages.flightdetails;
import com.test.session.com.test.sample.demotours.pages.login;
import com.test.session.com.test.sample.demotours.pages.selectflight;

public class demotourssite {
	
	static browser Browser = new browser();
	static login Login = new login();
	static flightdetails Flightdetails = new flightdetails();
	static selectflight Selectflight  = new selectflight();
	static bookflight Bookflight = new bookflight();


public static void main(String[] args) {
	
	
	
	browser.Openbrowser();
	login.alllinks();
	login.Login();
	flightdetails.selectradiobutton();
	flightdetails.Flightdetails();
	selectflight.Selectflight();
	bookflight.Bookflight();
	bookflight.Logout();
	browser.Closebrowser();
	
	
}
}




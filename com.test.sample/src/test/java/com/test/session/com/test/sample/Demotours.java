package com.test.session.com.test.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Demotours {
	public static WebDriver driver;
	
    
	public void Openbrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
	}
	
	
	public static void Login(String username, String password) {
		
		entertext("name","userName",username);
		entertext("name","password",password);
		clickelement("name","login");
		
		/*driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();*/
		
	}
	
	public void Flightdetails() {
		
		WebElement from = driver.findElement(By.name("fromPort"));
		Select select = new Select(from);
		select.selectByValue("New York");
		
		WebElement to = driver.findElement(By.name("toPort"));
		Select press = new Select(to);
		press.selectByValue("London");
		
		clickelement("name","findFlights");
	
		
		/*driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select")).sendKeys("New York");
		driver.findElement(By.name("toPort")).sendKeys("London");
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")).click();*/
		
	}
	
	
	public void SelectFlight() {
		
		
		clickelement("xpath","//input[@value='Blue Skies Airlines$361$271$7:10']");
		clickelement("xpath","//input[@value='Blue Skies Airlines$631$273$14:30']");
		clickelement("name","reserveFlights");
		
		/*driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[2]/font/b")).click();
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/p")).click();*/
		
	}
	
	
	
	public void Bookflight(String fname, String lname, String value) {
		
		entertext("xpath","//input[@name='passFirst0']",fname);
		entertext("xpath","//input[@name='passLast0']",lname);
		entertext("xpath","//input[@name='creditnumber']",value);
		clickelement("xpath"," //input[@name='buyFlights']");
		
	
		/*driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/input")).sendKeys("rao");
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("maha");
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("123456789");
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[23]/td/input")).click();*/
		
		
	}
	
	public void Logout() {
		
		clickelement("linktext","SIGN-OFF");
		
		//driver.findElement(By.linkText("SIGN-OFF")).click();
	}
	
	
	public void Closebrowser() {
		
		driver.quit();
	}
	
	/*public static void main(String[] args) {
		
		Openbrowser();
		Login();
		Flightdetails();
		SelectFlight();
		Bookflight();
		Logout();
		Closebrowser();
		
		
	}*/
	
	//common functions
	
public static void entertext(String locator,String locatorval, String value) {
		
		switch(locator) {
		
		case "name":
			driver.findElement(By.name(locatorval)).sendKeys(value);
			break;
		case "id":
			driver.findElement(By.id(locatorval)).sendKeys();
			break;
		case "css":
			driver.findElement(By.cssSelector(locatorval)).sendKeys();
			break;
		case "xpath":
			driver.findElement(By.xpath(locatorval)).sendKeys(value);	
			break;
		case "linktext":
			driver.findElement(By.linkText(locatorval)).sendKeys();	
			break;
		}
	}
	

public static void clickelement(String locator,String locatorval) {
		
		switch(locator) {
		
		case "name":
			driver.findElement(By.name(locatorval)).click();
			break;
		case "id":
			driver.findElement(By.id(locatorval)).click();
			break;
		case "css":
			driver.findElement(By.cssSelector(locatorval)).click();
			break;
		case "xpath":
			driver.findElement(By.xpath(locatorval)).click();	
			break;
		case "linktext":
			driver.findElement(By.linkText(locatorval)).click();	
			break;
			
			
		}
	}
	
 public void Assert(String locator, String locatorval) {
	
	switch(locator) {
	
	case "name":
		Assert.assertTrue(driver.findElement(By.name(locatorval)).isDisplayed());
		break;
	case "id":
		Assert.assertTrue(driver.findElement(By.id(locatorval)).isDisplayed());
		break;
	case "css":
		Assert.assertTrue(driver.findElement(By.cssSelector(locatorval)).isDisplayed());
		break;
	case "xpath":
		Assert.assertTrue(driver.findElement(By.xpath(locatorval)).isDisplayed());	
		break;
	case "linktext":
		Assert.assertTrue(driver.findElement(By.linkText(locatorval)).isDisplayed());	
		break;
	}
}

	}
	
	



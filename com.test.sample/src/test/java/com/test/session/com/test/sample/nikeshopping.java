package com.test.session.com.test.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class nikeshopping {
	
	
public static WebDriver driver;
	
	
	public static void Openbrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.nike.com/t/sfs-responder-backpack-nw2K4T/BA4886-222");
		/*driver.get("https://secure-store.nike.com/us/checkout/html/cart.jsp?country=US&country=US&l=cart&site=nikestore&returnURL=https://www.nike.com/t/brasilia-training-backpack-xl-4GnPX9/BA5331-410&route=html");
		try {
			Thread.sleep(2000L);
		}
		catch (Exception e) {
			// TODO: handle exception
		}*/
		
		//driver.get("https://www.nike.com/t/brasilia-training-backpack-xl-4GnPX9/BA5331-410");
		//driver.manage().window().maximize();
	}
	
	
	public static final String button_addtocart="//button[text()='Add to cart']";
	public static final String iconcheckout_addtocart="(//span[text()='1'])[2]";
	public static final String button_checkout="//input[@value='CHECKOUT']";
	public static final String button_guestcheckout = "//button[text()='Guest Checkout']";
	
	
	//public static void Cart() {
		
		/*driver.findElement(By.cssSelector("button.ncss-brand.pt2-sm.pr5-sm.pb2-sm.pl5-sm.u-uppercase.ncss-btn-black.fs18-sm.fs16-lg.ncss-brand.ncss-btn-black.pb3-sm.prl5-sm.pt3-sm.u-uppercase.css-1hzp36c.addToCartBtn")).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				}
		driver.findElement(By.xpath("//div[@id='PDP']/div/div[4]/div/div/div/div/div/div/div/div/div/div[3]/button")).click();
		try {
			Thread.sleep(2000L);
		}
		catch (Exception e) {
			// TODO: handle exception
	       }*/
		//driver.findElement(By.id("ch4_cartCheckoutBtn")).click();
		//driver.findElement(By.xpath("//input[@id='ch4_cartCheckoutBtn']")).click();
		//driver.findElement(By.xpath(".//*[@id='qa-guest-checkout']")).click();
		
		
	//}
	
	
	public static void checkout_guest()
	{
		driver.findElement(By.xpath(button_addtocart)).click();

		driver.findElement(By.xpath(iconcheckout_addtocart)).click();

		driver.findElement(By.xpath(button_checkout)).click();

		driver.findElement(By.xpath(button_guestcheckout)).click();

		

	}

	public static void Shipping() {
				
		//driver.findElement(By.xpath(".//*[@id='qa-guest-checkout']")).click();
		driver.findElement(By.xpath(".//*[@id='firstName']")).sendKeys("dominic");
		driver.findElement(By.xpath(".//*[@id='lastName']")).sendKeys("krog");
		driver.findElement(By.xpath(".//*[@id='address1']")).sendKeys("15 Mason Ave");
		driver.findElement(By.xpath(".//*[@id='city']")).sendKeys("East Brunswick");
		Select value= new Select(driver.findElement(By.xpath(".//*[@id='state']")));
		value.selectByVisibleText("New Jersey");
		//driver.findElement(By.xpath("//select[@id='state']/option[@value='NJ'")).click();
		driver.findElement(By.cssSelector("#postalCode")).sendKeys("08816");
		driver.findElement(By.cssSelector("#email")).sendKeys("dom_123@gmail.com");
		driver.findElement(By.cssSelector("#phoneNumber")).sendKeys("999-999-9999");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	
	public static void main(String[] args) {
		
		Openbrowser();
		//Cart();
		checkout_guest();
		Shipping();
		
	}
	
	

}










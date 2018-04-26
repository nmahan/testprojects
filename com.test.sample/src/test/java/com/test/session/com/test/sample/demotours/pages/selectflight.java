package com.test.session.com.test.sample.demotours.pages;

import org.openqa.selenium.By;

import com.test.session.com.test.sample.demotours.framework.selhelper;

public class selectflight extends selhelper {
	
       public static void Selectflight() {
		
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[2]/font/b")).click();
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/p")).click();
		
               }
	
}

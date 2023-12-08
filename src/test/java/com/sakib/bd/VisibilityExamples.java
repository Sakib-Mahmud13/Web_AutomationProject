package com.sakib.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VisibilityExamples extends BaseDriver {
	String url = "https://demo.nopcommerce.com/";
	@Test
	public void visibilityTest() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("small-searchterms"));
		
		try {
			if (search.isDisplayed()) {
				search.click();
				search.sendKeys("Macbook");
				Thread.sleep(5000);
				//Report
				
			}
			
		} catch (Exception e) {
			//Report
			
		
		} 
		
		
		
	}

}

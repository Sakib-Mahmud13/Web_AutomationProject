package com.sakib.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorExamples extends BaseDriver {
	String url = "https://demo.nopcommerce.com/";
	
	@Test
	public void locatorTest () throws InterruptedException {
		
		driver.get(url);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		//ID
		WebElement search = driver.findElement(By.id("small-searchterms"));
		search.click();
		search.sendKeys("Macbook");
		Thread.sleep(5000);
		
		WebElement login = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
		login.click();
		Thread.sleep(5000);
		//Text
		WebElement text = driver.findElement(By.xpath("//div[contains(text(),'By creating an account on our website, you will be')]"));
		System.out.println(text.getText());
		String font = text.getCssValue("font-size");
		System.out.println("Font: "+font);
		String color = text.getCssValue("background-color");
		System.out.println("Color: "+color);
		
		//By Name Locator
		WebElement email = driver.findElement(By.name("Email"));
		email.clear();
		email.sendKeys("test@noemail.com");
		System.out.println(email.getAttribute("data-val-required"));
		Thread.sleep(5000);
			
		//Link Text
//		WebElement forgotPass = driver.findElement(By.linkText("Forgot password?"));
//		forgotPass.click();
//		Thread.sleep(5000);
		
		//Partial Link Text
		WebElement forgotPass = driver.findElement(By.partialLinkText("Forgot"));
		forgotPass.click();
		Thread.sleep(5000);
		
		
	}

}






package com.sakib.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownExamples extends BaseDriver {
	String url = "https://islamicshopdk.com/";
	@Test
	public void dropDownTest () throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		
		
		WebElement options =  driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select select = new Select(options);
		
		//Index
		select.selectByIndex(5);
		Thread.sleep(3000);	
		
		//Text
		select.selectByVisibleText("Computers");
		Thread.sleep(3000);
		
	}

}

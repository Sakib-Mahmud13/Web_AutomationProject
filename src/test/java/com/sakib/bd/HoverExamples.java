package com.sakib.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverExamples extends BaseDriver {
	String url = "https://www.daraz.com.bd/";
	@Test
	public void hoverTest() throws InterruptedException {
		
		driver.get(url);
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		
		WebElement lifestyle = driver.findElement(By.xpath("//span[contains(text(),'Home & Lifestyle')]"));
		action.moveToElement(lifestyle).perform();
		Thread.sleep(5000);
		
		WebElement craft = driver.findElement(By.xpath("//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[10]/li[10]/a[1]/span[1]"));
		action.moveToElement(craft).perform();
		Thread.sleep(5000);
		
		WebElement artworks = driver.findElement(By.xpath("//span[contains(text(),'Artworks')]"));
		artworks.click();
		Thread.sleep(5000);
	}

}

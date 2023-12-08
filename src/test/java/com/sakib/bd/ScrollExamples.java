package com.sakib.bd;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollExamples extends BaseDriver {
	String url = "https://islamicshopdk.com/";
	@Test
	public void scrollTest () throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Down
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		
		//Specific
		WebElement locaton = driver.findElement(By.xpath("//h2[contains(text(),'For your Fitness Needs')]"));
		js.executeScript("arguments[0].scrollIntoView(true);", locaton);
		Thread.sleep(5000);
		
		//Top
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(5000);
		
		
		
	}

}

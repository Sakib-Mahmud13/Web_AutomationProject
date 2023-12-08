package com.sakib.bd;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class TabWindowHandling extends BaseDriver{
	
	String url = "https://www.amazon.com/";
	String secondUrl = "https://www.daraz.com.bd/";
	@Test
	public void tabwindowTest() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		
		String originalTab = driver.getWindowHandle();
		Thread.sleep(3000);
		
//		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		String secondTab = driver.getWindowHandle();
		driver.get(secondUrl);
		Thread.sleep(3000);
		
		driver.switchTo().window(originalTab);
		Thread.sleep(3000);
		
		driver.switchTo().window(secondTab);
		Thread.sleep(3000);
		
	
		
	}

}

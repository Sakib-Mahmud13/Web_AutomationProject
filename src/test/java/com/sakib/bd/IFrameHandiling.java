package com.sakib.bd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IFrameHandiling extends BaseDriver{
	String url = "https://demoqa.com/frames";
	@Test
	public void iframeTest() {
		
		driver.get(url);
		driver.manage().window().maximize();
		List<WebElement> iframeNumber = driver.findElements(By.tagName("iframe"));
		System.out.println(iframeNumber.size());
		driver.switchTo().frame("frame1");
		
		WebElement text = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(text.getText());
		
		driver.switchTo().defaultContent();
		
		WebElement text2 = driver.findElement(By.xpath("//div[contains(text(),'Sample Iframe page There are 2 Iframes in this pag')]"));
		System.out.println(text2.getText());
		
		
	}

}

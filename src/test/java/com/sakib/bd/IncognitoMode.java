package com.sakib.bd;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class IncognitoMode extends BaseDriver{
	String url = "https://www.amazon.com/";
	@Test
	public void incognitomodeTest() throws InterruptedException, AWTException {
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(100);
		
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.delay(100);
		
		robot.keyPress(KeyEvent.VK_N);
		robot.delay(100);
		
		driver.switchTo().window(windowHandling().get(1));
		driver.get(url);
		Thread.sleep(5000);
		
		driver.switchTo().window(windowHandling().get(0));
		driver.get(url);
		Thread.sleep(5000);
		
	}
	public List<String> windowHandling() {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>windowHandleList = new ArrayList<String>(windowHandles);
		
		return windowHandleList;
		
		
		
	}

}

package com.sakib.bd;

//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExamples extends BaseDriver {
	
	String url = "https://www.amazon.com/";
	@Test
	public void assertionTest() {
		driver.get(url);
		driver.manage().window().maximize();
		
		String expectedTitle = "mazon.com. Spend less. Smile more.";
		String actualTitle = driver.getTitle();
		
		//Hard Assertion
//		Assert.assertEquals(actualTitle,expectedTitle);
		
		//Soft Assertion
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actualTitle,expectedTitle);
		System.out.println("Hello.......!");
		
		softassert.assertAll();
		
		
		
		
		
	}

}

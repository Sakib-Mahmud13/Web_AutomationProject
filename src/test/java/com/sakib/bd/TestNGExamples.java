package com.sakib.bd;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExamples {
	@Test (priority = 0) ////0= high priority
	public void TestExample() {
		
		System.out.println("Test................!");
	}
	@Test (priority = 1)
	public void TestExample2() {
			
			System.out.println("Test 2..............!");
		}
	
	
	@BeforeSuite
	public void beforeSuiteExample() {
		
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuiteExample() {
		
		System.out.println("After Suite");
	}
	@BeforeTest
	public void beforeTestExample() {
		
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTestExample() {
		
		System.out.println("After Test");
	}
	@BeforeClass
	public void beforeClassExample() {
		
		System.out.println("Before Class");
	}
	@AfterClass
	public void afterClassExample() {
		
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void beforeMethodExample() {
		
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethodExample() {
		
		System.out.println("After Method");
	}




}

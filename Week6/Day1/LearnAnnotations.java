package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotations {

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");

	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
		

	}
	

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");

	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");

	}
	
	@Test
	public void testcase1() {
		System.out.println("Tescase 1");

	}
	
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");

	}
	
	@Test
	public void testcase2() {
		System.out.println("Testcase 2");
	}
	
	
	@Test
	public void testcase3() {
		System.out.println("Testcase 3");
	}
	
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");

	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");

	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");

	}
	
}

package testSuit01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Module01 {

	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am executing beforeSuite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am executing afterSuite");
	}
	
	//: The annotated method will be run after all tests in this suite have run.
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am executing beforeTest");
	}
	//: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
	@AfterTest
	public void afterTest() {
		System.out.println("I am executing afterTest");
	}
	//: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am executing beforeClass");
	}
	//: The annotated method will be run before the first test method in the current class is invoked.
	@AfterClass
	public void afterClass() {
		System.out.println("I am executing afterClass");
	}
	//: The annotated method will be run after all the test methods in the current class have been run.
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am executing beforeMethod");
	}
	//: The annotated method will be run before each test method.
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am executing afterMethod");
	}
	//: The annotated method will be run after each test method.
	@Test
	public void test001() {
		System.out.println("I am executing test case 001");
	}
}

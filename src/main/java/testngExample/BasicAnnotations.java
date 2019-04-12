package testngExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotations {
	
	
	
	@BeforeTest
	public void setupTest()
	{
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void tearDownTest()
	{
		System.out.println("After Test");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test 2");
	}
	
	
	@BeforeClass
	public void setupClass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void tearDownClass()
	{
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void setupMethod()
	{
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void tearDownMethod()
	{
		System.out.println("After MEthod");
	}
	
	
	

}

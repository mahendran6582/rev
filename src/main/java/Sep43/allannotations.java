package Sep43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class allannotations {
	@BeforeSuite()
	void loga() 
	{
		System.out.println("beforesuite");
		
	}
	@AfterSuite()
	void logb() 
	{
		System.out.println("aftersuite");	
	}
	@BeforeMethod
	void login ()
	{
		System.out.println("This is before method");
	}

	@Test
	void search ()
	{
		System.out.println("This is test1");
	}
	
	@Test
	void advsearch ()
	{
		System.out.println("This is test2");
	}
	
	@AfterMethod
	void logout ()
	{
		System.out.println("This is aftermethod");
	}
	
	
	@BeforeClass()
	void logina() 
	{
		System.out.println("beforeclass");
		
	}
	@AfterClass()
	void logouts() 
	{
		System.out.println("afterclass");	
	}
	

	
}

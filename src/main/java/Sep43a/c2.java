package Sep43a;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c2 {

	@AfterTest()
	void login() 
	{
		System.out.println("This is after test");
		
	}
	
@Test
	void search() 
	{
		System.out.println("This is C2");
	}
}

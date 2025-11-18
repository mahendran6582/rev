package Sep43a;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c3 {
	@Test
	void advsearch() 
	{
		System.out.println("This is C3");
	}

@BeforeSuite()
void as() 
{
	System.out.println("this is before suite");
	
}
	
@AfterSuite()
void bs() 
{
	System.out.println("this is after suite");
	
}	
}

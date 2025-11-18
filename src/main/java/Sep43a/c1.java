package Sep43a;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c1 {


	
@Test
	void advsearch() 
	{
		System.out.println("This is C1");
	}

@BeforeTest()
void login() 
{
	System.out.println("this is before test");
	
}
}

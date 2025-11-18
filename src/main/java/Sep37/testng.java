package Sep37;

import org.testng.annotations.Test;

public class testng {
	//open
	//login
	//logout
	
	@Test (priority = 1)
	
	void openapp ()
	{
		System.out.println("Open app");
		
	}
	@Test (priority = 2)
	void login ()
	{
		System.out.println("login");
		
	}
	
	@Test (priority = 3)
	void logout ()
	{
		System.out.println("log out");
		
	}
	
}

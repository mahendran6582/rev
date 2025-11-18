package Sep44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependency {
	
	@Test(priority =1 )
	void openapp()
	{
		System.out.println("Openapp");
		Assert.assertTrue(false);
		
	}
	@Test(priority =1,dependsOnMethods = {"openapp"})
	void login()
	{
		System.out.println("login");
	}
	
	@Test(priority =1,dependsOnMethods = {"login"})
	void search()
	{
		System.out.println("search");
	}
	
	@Test(priority =1, dependsOnMethods = {"search"})
	void advsearch()
	{
		System.out.println("advsearch");
	}
	
	@Test(priority =1,dependsOnMethods = {"advsearch"})
	void logout()
	{
		System.out.println("logout");
	}

}

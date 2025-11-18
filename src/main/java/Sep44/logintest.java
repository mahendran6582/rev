package Sep44;

import org.testng.annotations.Test;

public class logintest {
	
	
	@Test(priority =1,groups = {"sanity"})
	void loginbyemail ()
	{
		System.out.println("login in by email");
		
	}
	@Test(priority =2, groups = {"sanity"})
	void loginbyfacebook ()
	{
		System.out.println("login in by facebook");
		
	}
	@Test(priority =3,groups = {"sanity"})
	void loginbytwitter ()
	{
		System.out.println("login in by twitter");
		
	}
}

package Sep44;

import org.testng.annotations.Test;

public class signuptest {
	
	@Test(priority =1,groups = {"regression"})
	void signupbyemail ()
	{
		System.out.println("signupemail");
		
	}
	@Test(priority =2,groups = {"regression"})
	void signupbyfacebook ()
	{
		System.out.println("signupfacebook");
		
	}
	@Test(priority =3,groups = {"regression"})
	void signupbytwitter ()
	{
		System.out.println("signuptwitter");
		
	}
}

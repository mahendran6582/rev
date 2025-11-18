package Tc28;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_03_TestDD extends BaseClass{
	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	
	public void testdd(String user, String pwd, String exp) {
		
		try {
		
		
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setlogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setemail(user);
		lp.setpass(pwd);
		lp.setlogin();
		
		MyAccountPage mp = new MyAccountPage(driver);
		boolean sucess = mp.loginsucc();
		
		
		
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(sucess==true)
			{
				mp.setlogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("InValid"))
		{
			if(sucess==true)
			{
				mp.setlogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		
		
	}

}
	

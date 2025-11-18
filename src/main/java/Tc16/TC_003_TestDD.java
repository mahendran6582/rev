package Tc16;

import org.testng.Assert;
import org.testng.annotations.Test;

import Tc13.DataProviders;

public class TC_003_TestDD extends BaseClass{
	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void testDD (String email, String pwd, String exp) {
	
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setlogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setemail(email);
		lp.setpass(pwd);
		lp.setclick();
		
		MyAccountPage mp = new MyAccountPage(driver);
		boolean msgconfirm = mp.msgsuccess();
		
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(msgconfirm==true)
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
			if(msgconfirm==true)
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
	
}

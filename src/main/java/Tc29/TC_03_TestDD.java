package Tc29;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_03_TestDD extends BaseClass{
	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class, groups = "DataDriven")
	public void testdd(String user, String pwd, String exp) {
		
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setlogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setemail(user);
		lp.setpass(pwd);
		lp.setlogin();
		
		MyAccountPage mp = new MyAccountPage(driver);
		
		boolean message = mp.setmyaccounttxt();

		
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(message==true)
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
			if(message==true)
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

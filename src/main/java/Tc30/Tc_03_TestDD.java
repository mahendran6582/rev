package Tc30;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc_03_TestDD extends BaseClass{
	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class, groups = "DataDriven")
	public void testddval(String email, String pwd, String exp) {
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setlogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setemail(email);
		lp.setpass(pwd);
		lp.setlogin();
		
		MyAccountPage mp = new MyAccountPage(driver);
		boolean mess = mp.setmyaccount();
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(mess==true)
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
			if(mess==true)
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

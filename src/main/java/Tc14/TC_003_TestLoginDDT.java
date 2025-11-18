package Tc14;

import org.testng.Assert;
import org.testng.annotations.Test;

import Tc13.DataProviders;

public class TC_003_TestLoginDDT extends BaseClass{
	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)	
	public void LoginDDT(String user, String pwd, String exp) {
		
		HomePage hp = new HomePage(driver);
		hp.clickmyaccount();
		hp.clicklogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setemail(user);
		lp.setpass(pwd);
		lp.setlogin();
		
		MyAccountPage ma = new MyAccountPage(driver);
		boolean myaccpage = ma.isMyAccountPageExists();
		
		
		
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(myaccpage==true)
			{
				
				ma.setlogout();
				Assert.assertTrue(true);
				
		}
			else
			{
				Assert.assertTrue(false);
			}
			
		}
		
			if(exp.equalsIgnoreCase("InValid"))
			{
				if(myaccpage==true)
				{
					
					ma.setlogout();
					Assert.assertTrue(false);
					
			}
				else
				{
					Assert.assertTrue(true);
				}
		
	}
		}
	}

			
	



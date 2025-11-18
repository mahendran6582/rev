package Tc13;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_003_LoginDDT extends BaseClass{
	
	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void logintest(String email, String pwd, String exp) {
		
		
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setlogin();
		
		
		
		LoginPage lp = new LoginPage(driver);
		lp.setemail(email);
		lp.setpass(pwd);
		lp.setclick();
		
		
		// datavalid - login success - pass
		//				login failed - fail
						
		//datainvalid - login success - fail
		//				login fail - pass
		
		MyAccountPage myacc = new MyAccountPage(driver);
	boolean targetPage = myacc.isMyAccountPageExists();
	
	
	if(exp.equalsIgnoreCase("Valid"))
	{
		if(targetPage==true)
		{
			myacc.setlogout();
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
			
		}
	}
	
	if(exp.equalsIgnoreCase("InValid"))
	{
		if(targetPage==true)
		{
			myacc.setlogout();
			Assert.assertTrue(false);
		
		}
		else
		{
			Assert.assertTrue(true);
			
		}
	}
		
		
	}
	
	

}

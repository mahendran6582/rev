package Tc15;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_003_TestLoginDD extends BaseClass{
	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)

	public void loginvaldd(String user, String pwd, String exp) {
		
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setlogin();
		
		
		LoginPage lp = new LoginPage(driver);
		lp.setemail(user);
		lp.setpass(pwd);
		lp.setlogin();
		
		MyAccountPage myacc = new MyAccountPage(driver);
		boolean cofirmmess = myacc.msgconfirm();
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			
			if(cofirmmess==true)
			{
				myacc.setlogout();
				Assert.assertTrue(true);
				
			}
			else {
				Assert.assertTrue(false);
			}
				
		}
		
		if(exp.equalsIgnoreCase("InValid"))
		{
			
			if(cofirmmess==true)
			{
				myacc.setlogout();
				Assert.assertTrue(false);
				
			}
			else {
				Assert.assertTrue(true);
			}
				
		}
		
		
		
		
	}
	

}

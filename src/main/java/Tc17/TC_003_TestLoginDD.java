package Tc17;

import org.testng.Assert;

import org.testng.annotations.Test;



public class TC_003_TestLoginDD extends BaseClass{
	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class, groups="DataDriver")
	public void loginDD(String email, String pwd, String exp) {
	
	HomePage hp = new HomePage(driver);
	hp.clickmyaccount();
	hp.clicklogin();

	LoginPage lp = new LoginPage(driver);
	lp.setemail(email);
	lp.setpass(pwd);
	lp.setlogin();
	
	
	MyAccountPage mp = new MyAccountPage(driver);
	boolean message = mp.confirmmessage();
	
	
	if(exp.equalsIgnoreCase("Valid"))
	{
		if(message==true)
		{
			mp.setlogout();
			Assert.assertTrue(true);
		}
	
	else {
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
	
	else {
		Assert.assertTrue(true);
	}
	}
	
}
}

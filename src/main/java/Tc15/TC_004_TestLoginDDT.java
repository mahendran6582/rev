package Tc15;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TC_004_TestLoginDDT extends BaseClass{
	
	@Test(dataProvider="LoginData", dataProviderClass = DataProviders.class)
	
	public void datadriver(String user, String pwd, String exp) {
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setlogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setemail(user);
		lp.setpass(pwd);
		lp.setlogin();
		
		
		MyAccountPage map = new MyAccountPage(driver);
		boolean msgconfirm = map.msgconfirm();
		
		Assert.assertTrue(msgconfirm);
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(msgconfirm==true)
			{
				map.setlogout();
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
				map.setlogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		
		
		
		
		
		
		
	}
	
	

}

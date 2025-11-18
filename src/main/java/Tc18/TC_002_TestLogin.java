package Tc18;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_002_TestLogin extends BaseClass{
	
	@Test(groups = {"Sanity", "Master"})
	public void loginval() {
		
		HomePage hp = new HomePage(driver);
		hp.linkaccount();
		hp.linklogin();
		
		
		LoginPage lp = new LoginPage(driver);
		lp.setemail(p.getProperty("email"));
		lp.setpass(p.getProperty("pwd"));
		lp.setlogin();
		
		MyAccountPage mp = new MyAccountPage(driver);
		boolean confirm = mp.myaccount();
		Assert.assertTrue(confirm);
				
		
	}

}

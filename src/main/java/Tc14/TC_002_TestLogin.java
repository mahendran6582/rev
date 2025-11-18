package Tc14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_002_TestLogin extends BaseClass{
	
	@Test
	public void login() {
		
		
		HomePage hp = new HomePage(driver);
		hp.clickmyaccount();
		hp.clicklogin();
		
		
		LoginPage lp = new LoginPage(driver);
		lp.setemail(p.getProperty("email"));
		lp.setpass(p.getProperty("pass"));
		lp.setlogin();
		
		
		 MyAccountPage ma = new MyAccountPage(driver);
		 
		 boolean myloginpage = ma.isMyAccountPageExists();
		 Assert.assertEquals(myloginpage, true);
		
		
		
	}
	
	
	
	

}

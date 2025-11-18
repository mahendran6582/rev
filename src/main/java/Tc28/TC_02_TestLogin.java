package Tc28;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_02_TestLogin extends BaseClass{

	
	
	@Test
	public void loginvalid() {
		
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setlogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setemail(p.getProperty("email"));
		lp.setpass(p.getProperty("pwd"));
		lp.setlogin();
		
		MyAccountPage mp = new MyAccountPage(driver);
		boolean succ = mp.loginsucc();
		
		Assert.assertTrue(succ);
		
		mp.setlogout();
		
		
		
	}
	
}

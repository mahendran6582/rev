package Tc16;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_002_TestLogin extends BaseClass{
	
	@Test
	public void TestLogin() {
		
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setlogin();
		
		
		LoginPage lp = new LoginPage(driver);
		lp.setemail(p.getProperty("username"));
		lp.setpass(p.getProperty("pwd"));
		lp.setclick();
		
		MyAccountPage mp = new MyAccountPage(driver);
		boolean message = mp.msgsuccess();
		Assert.assertTrue(message);
		
				
	}

}

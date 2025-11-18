package Tc13;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_LoginTest extends BaseClass{
	
	
	
	@Test
	public void logintest() {
		
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setlogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setemail(p.getProperty("email"));
		lp.setpass(p.getProperty("pass"));
		lp.setclick();
		
		

		MyAccountPage myacc = new MyAccountPage(driver);
		boolean page = myacc.isMyAccountPageExists();
		Assert.assertEquals(page, true);
		
		
		
	}
	
	
}

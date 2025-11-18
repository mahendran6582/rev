package Tc30;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc_02_TestLogin extends BaseClass{
	
	@Test(groups = {"Master", "Sanity"})
	public void loginval() {
		HomePage hp = new HomePage(driver); 
			hp.setmyaccount();
			hp.setlogin();
	
			LoginPage lp = new LoginPage(driver);
			lp.setemail(p.getProperty("email"));
			lp.setpass(p.getProperty("pwd"));
			lp.setlogin();
	
			MyAccountPage mp = new MyAccountPage(driver);
			boolean mess = mp.setmyaccount();
			Assert.assertTrue(mess);
		
				
	
	}
			
	}


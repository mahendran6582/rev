package Tc19;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_002_TestLogin extends BaseClass{
	
	public WebDriver driver;
	
	@Test
	public void testlogin() {
		
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setlogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setemail(p.getProperty("email"));
		lp.setpass(p.getProperty("pwd"));
		lp.setlogin();
		
		MyAccountPage mp = new MyAccountPage(driver);
		boolean mess = mp.succmsg();
		
		Assert.assertTrue(mess);
		
		
		
	}

}

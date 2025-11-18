package Tc30;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_01_TestRegister extends BaseClass{
	
	
	@Test(groups = {"Master", "Regression"})
	public void testregister() {
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setmyregister();
		
		RegisterPage rp = new RegisterPage(driver);
		rp.setfirstname(RandomAlpha().toUpperCase());
		rp.setlastname(RandomAlpha().toUpperCase());
		rp.setemail(RandomAlpha()+"@gmail.com");
		rp.settele(RandomNumeric());
		
		String password = RandomAlphaNumeric();
		rp.setpass(password);
		rp.setcpass(password);
		rp.setagree();
		rp.setcontinue();
		
		String mess = rp.setmessage();
		
		Assert.assertEquals(mess, "Your Account Has Been Created!");
		
		
	}

}

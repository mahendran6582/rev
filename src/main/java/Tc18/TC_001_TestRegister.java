package Tc18;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_001_TestRegister extends BaseClass{
	
	@Test(groups = {"Regression", "Master"})
	public void register() {
		
		HomePage hp = new HomePage(driver);
		hp.linkaccount();
		hp.linkregister();
		
		
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
		
		
		String mess = rp.confirmmsg();
		Assert.assertEquals(mess, "Your Account Has Been Created");
		
	}
	
		
}

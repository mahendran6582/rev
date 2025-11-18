package Tc28;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_01_TestRegister extends BaseClass{
	
	@Test
	public void testregister() {
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setregister();
		
		
		RegisterPage rp = new RegisterPage(driver);
		rp.setfirstname(RandomStringAlpha().toUpperCase());
		rp.setlastname(RandomStringAlpha().toUpperCase());
		rp.setemail(RandomStringAlpha()+"@gmail.com");
		rp.settelephone(RandomStringNumeric());
		
		String password = RandomStringAlphaNumeric();
		
		rp.setpassword(password);
		rp.setcpassword(password);
		rp.setagree();
		rp.setcontinue();
		
		String regmessage = rp.setmess();
		
		Assert.assertEquals(regmessage, "Your Account Has Been Created!");
				
		
	}

}

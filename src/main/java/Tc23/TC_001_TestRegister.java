package Tc23;

import org.apache.commons.lang3.RandomStringUtils;

public class TC_001_TestRegister extends BaseClass{
	
	
	@Test
	public void registerval() {
		
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setregister();
		
		RegisterPage rp = new RegisterPage(driver);
		rp.setfirstname(RandomStringAlpha().toUpperCase());
		rp.setlastname(RandomStringAlpha().toUpperCase());
		rp.setemail(RandomStringAlpha()+"@gmail.com");
		rp.settele(RandomStringNumeric());
		
		String password = RandomStringAlphaNumeric();
		rp.setpass(password);
		rp.setcpass(password);
		rp.setagree();
		rp.setcontinue();
		
		String message= rp.setmessage();
		Assert.assertEquals(message, "Your Account Has Been Created!");
		
	}
	

}

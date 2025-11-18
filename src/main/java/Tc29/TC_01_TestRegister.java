package Tc29;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_01_TestRegister extends BaseClass{
	
	@Test(groups = {"Master", "Regression"})
	public void RegVal() {
		
	HomePage hp = new HomePage(driver);
	hp.setmyaccount();
	hp.setregister();
	
	
	RegisterPage rp = new RegisterPage(driver);
	rp.setfirstname(RandomAlpha().toUpperCase());
	rp.setlastname(RandomAlpha().toUpperCase());
	rp.setemail(RandomAlpha()+"@gmail.com");
	rp.settelephone(RandomNumeric());
	
	String password = RandomAlphaNumeric();
	
	
	rp.setpassword(password);
	rp.setcpassword(password);
	rp.setagree();
	rp.setcontinue();
	
	String message = rp.setmess();
	Assert.assertEquals(message, "Your Account Has Been Created!");	
	
		
	}
	

}

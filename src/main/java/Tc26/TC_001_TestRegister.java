package Tc26;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_001_TestRegister extends BaseClass{
	// public WebDriver driver;
	
	@Test
	public void homeval() {
		
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setregister();
		
		RegisterPage rp = new RegisterPage(driver);
		rp.setfirstname(RandomStringAlpha().toUpperCase());
		rp.setlastname(RandomStringAlpha().toUpperCase());
		rp.setemail(RandomStringAlpha()+"@gmail.com");
		rp.settele(RandomStringNumeric());
		
		String password = RandomStringAlphaNumeric();
		
		rp.setpassword(password);
		rp.setcpassword(password);
		rp.setagree();
		rp.setcontinue();
		
		String mess = rp.setconfirmmess();
		Assert.assertEquals(mess, "Your Account Has Been Created!");
				
		
	}
	

}

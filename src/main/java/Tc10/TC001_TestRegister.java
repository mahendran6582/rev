package Tc10;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_TestRegister extends BaseClass {

	
	@Test
	public void registerpage()
	{
		HomePage Hp = new HomePage(driver);
		Hp.clickmyaccount();
		Hp.clickregister();
		
		RegisterPage Rp = new RegisterPage(driver);
		
		Rp.setfirstname(RandomStringAlpha().toUpperCase());
		Rp.setlastname(RandomStringAlpha().toUpperCase());
		Rp.setemail(RandomStringAlpha()+"@gmail.com");
		Rp.settele(RandomStringNumeric());
		
		
		String password= RandomStringAlphaNumeric();
		
		
		Rp.setpass(password);
		Rp.setcpass(password);
		Rp.setcheck();
		Rp.setconfirm();
		
		String mgeconfirm = Rp.msgconfirmation();
		
		Assert.assertEquals(mgeconfirm, "Your Account Has Been Created!");
	}
	
		
	

}

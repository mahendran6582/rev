package Tc16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
	
	public WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txt_firstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txt_lastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txt_email;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txt_telephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txt_password;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txt_cpassword;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chk_agree;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btn_continue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement get_mess;
	
	public void setfirstname(String fname) {
		txt_firstname.sendKeys(fname);	
	}

	public void setlasttname(String lname) {
		txt_lastname.sendKeys(lname);
	}

	public void setemail(String email) {
		txt_email.sendKeys(email);
	}

	public void settele(String tele) {
		txt_telephone.sendKeys(tele);
	}

	public void setpass(String pass) {
		txt_password.sendKeys(pass);
	}
	
	public void setcpass(String cpass) {
		txt_cpassword.sendKeys(cpass);
	}

	public void setagree() {
		chk_agree.click();
		
	}
	public void setconfirm() {
		btn_continue.click();
	}
	
	public String confirmmess() {
		try {
			return(get_mess.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	
}

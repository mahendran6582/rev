package Tc10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

	WebDriver driver;
	
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
	WebElement txt_tele;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txt_pass;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txt_cpass;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chck_agree;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btn_continue;

	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msg_confirm;
	
	
	public void setfirstname(String fname) {
		txt_firstname.sendKeys(fname);
		
	}
	
	public void setlastname(String lname) {
		txt_lastname.sendKeys(lname);
		
	}
		
	public void setemail(String email) {
		txt_email.sendKeys(email);
	}
	
	public void settele(String tele) {
		txt_tele.sendKeys(tele);
		
	}
	
	public void setpass(String pass) {
		txt_pass.sendKeys(pass);
		
	}

	public void setcpass(String cpass) {
		txt_cpass.sendKeys(cpass);
	}

	public void setcheck() {
		chck_agree.click();
	}

	public void setconfirm() {
		btn_continue.click();
	
	}


	public String msgconfirmation() {
		try{
			return(msg_confirm.getText());
		}
			catch(Exception e)
		{
			return(e.getMessage());
				
			}
		}
		
	}



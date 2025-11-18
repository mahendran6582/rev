package Tc02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccRegister extends BasePage{
	WebDriver driver;
	
	public AccRegister(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement textfirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtlastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txttelephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpass;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtpconfirm;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkagree;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement bttncontinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement messageconfirm;
	
	
	public void setfirstname(String firstname) {
		textfirstname.sendKeys(firstname);
	}
	
	public void setlastname(String lastname) {
		txtlastname.sendKeys(lastname);
	}
	
	public void setemail(String email) {
		txtemail.sendKeys(email);
	}
	
	public void settele(String tele) {
		txttelephone.sendKeys(tele);
	}
	
	public void setpassword(String pass) {
		txtpass.sendKeys(pass);
	}
	
	public void setcpassword(String cpass) {
		txtpconfirm.sendKeys(cpass);
	}
	
	public void setagree() {
		chkagree.click();
	}
	
	public void setbutton() {
		bttncontinue.click();
	}
	
public String confirmmessage() {
	try {
		return(messageconfirm.getText());
	}
		catch(Exception e)
		{
			return(e.getMessage());			
		}
				
	}
}


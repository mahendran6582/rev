package Tc03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends HomePage{
	WebDriver driver;
	
	public RegisterPage(WebDriver driver){
	super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtfirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtlastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txttelephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtcpassword;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkagree;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btncontinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgconfirmation;
	
	public void setfirstname(String fname) {
		txtfirstname.sendKeys(fname);
		
	}
	
	public void setlasttname(String lname) {
		txtlastname.sendKeys(lname);
		
	}
	
	public void setemail(String email) {
		txtemail.sendKeys(email);
		
	}
	
	public void settele(String tele) {
		txttelephone.sendKeys(tele);
		
	}
	
	
	public void setpasswrd(String passwrd) {
		txtpassword.sendKeys(passwrd);
		
	}
	
	
	public void setcpasswrd(String cpasswrd) {
		txtcpassword.sendKeys(cpasswrd);
		
	}
	
	
	public void setchkagree() {
		chkagree.click();		
	}
	
	
	public void setfbtncontinue() {
		btncontinue.click();
		
	}
	
	
	public String getmsgconfirm() {
		try {
			return(msgconfirmation.getText());
		}
			catch(Exception e) {
				return(e.getMessage());
			}
		}
	
	

}

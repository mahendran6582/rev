package Tc04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResgistrationPage extends BasePage{
	WebDriver driver;
	
	public ResgistrationPage(WebDriver driver){
		
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtfirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtlastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemail;
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtteleph;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpassword;
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtcpassword;
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkagree;
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btncontinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement confirmmsg;
	
	public void setfirstname(String first) {
		txtfirstname.sendKeys(first);
	}
	
	public void setlastname(String last) {
		txtlastname.sendKeys(last);
	}
	public void setemail(String email) {
		txtemail.sendKeys(email);
	}
	public void setteleph(String teleph) {
		txtteleph.sendKeys(teleph);
	}
	public void setpass(String pass) {
		txtpassword.sendKeys(pass);
	}
	public void setcpass(String cpass) {
		txtcpassword.sendKeys(cpass);
	}
	public void setagree(String agree) {
		chkagree.sendKeys(agree);
	}
	public void setcontinue(String contin) {
		btncontinue.sendKeys(contin);
	}
	
	
	public String getconfirmation() {
		try {
			return(confirmmsg.getText());
		}
		catch(Exception e)
		{
		return(e.getMessage());
		
		}
	}
	
	
}

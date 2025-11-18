package Tc07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccRegisterPage extends BasePage{
	
	WebDriver driver;
	
	public AccRegisterPage(WebDriver driver) {
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
	WebElement txtpass;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtcpass;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement checkboxagree;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btncontinue;
	
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement confirmmessage;
	
	public void setfirstname(String fname) {
		txtfirstname.sendKeys(fname);
	}
	
	public void setlastname(String lname) {
		txtlastname.sendKeys(lname);
	}
	
	public void setemail(String email) {
		txtemail.sendKeys(email);
	}
	
	public void settele(String tele) {
		txttelephone.sendKeys(tele);
	}
	
	public void setpass(String pass) {
		txtpass.sendKeys(pass);
		
	}
	
	public void setcpass(String cpass) {
		txtcpass.sendKeys(cpass);
	}
	
	public void setagree() {
		checkboxagree.click();
	}
	
	public void setcontinue() {
		btncontinue.click();
	}
	
	
	public String getconfirmmessage() {
		try {
			return(confirmmessage.getText());
		}
		catch(Exception e)
		{
				return(e.getMessage());
			}
		}
	}



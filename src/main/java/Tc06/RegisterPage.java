package Tc06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath="//input[@id='input-firstname']") 
	WebElement txtfirstname;
	
	
	@FindBy(xpath="//input[@id='input-lastname']") 
	WebElement txtlastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txttele;
	
	@FindBy(xpath="//input[@id='input-password']") 
	WebElement txtpass;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtcpass;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement txtagree;
	
	@FindBy(xpath="//input[@value='Continue']") 
	WebElement txtconfirm;
	
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") 
	WebElement confirmmessage;
	
	
	public void setfirstname(String firstname) {
		
		txtfirstname.sendKeys(firstname);
	}
	
	public void setlastname(String lastname) {
		
	txtlastname.sendKeys(lastname);
	}

	public void setemail(String email) {
		
		txtemail.sendKeys(email);
	}
	
	public void settele(String tele) {
		
		txttele.sendKeys(tele);	
	}
	
	public void setpass(String pass) {
		
		txtpass.sendKeys(pass);	
	}
	
	public void setcpass(String cpass) {
		
		txtcpass.sendKeys(cpass);	
	}

	public void setagree() {
		
		txtagree.click();	
	}
	
	public void setconfirm (){
		
		txtconfirm.click();
	}
	
	
	public String getmessage() {
		
		try {
			return(confirmmessage.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
		
		}
	
}

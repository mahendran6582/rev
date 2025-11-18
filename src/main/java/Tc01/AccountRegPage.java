package Tc01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegPage extends BasePage{
	
	WebDriver driver;
	
	public AccountRegPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id=\'input-firstname\']")
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
	WebElement txtpasswordconfirm;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkagree;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btncontin;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgconfirm;
	
	public void setfirstname(String fname)
	{
		txtfirstname.sendKeys(fname);
	}
	
	public void setlastname(String lname)
	{
		txtlastname.sendKeys(lname);
	}
	
	public void setemail(String email)
	{
		txtemail.sendKeys(email);
		
	}
	
	public void settelephone(String tel)
	{
		txttelephone.sendKeys(tel);
	}
	
	public void setpass(String pass)
	{
		txtpassword.sendKeys(pass);
		
	}
	
	public void setcpass(String cpass)
	{
		txtpasswordconfirm.sendKeys(cpass);
		
	}
	
	public void setagree()
	{
		chkagree.click();
	}
	
	public void setconfirm()
	{
		btncontin.click();
	}
	
	
	public String msgconfirmation() {
		try {
			return(msgconfirm.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());	
		
		}
				
	}
}

package Tc01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountReg extends BasePage{
	
	WebDriver driver;
	
	public AccountReg(WebDriver driver){
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtfstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtlstname;
	
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txttele;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpasswd;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtcfpassc;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkagree;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btncnti;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgconfirmation;
	
	
	public void setfirstname(String fname)
	{
		txtfstname.sendKeys();
	}
	
	public void setlastname(String lname)
	{
		txtfstname.sendKeys();
	}
	
	
	public void setemail(String email)
	{
		txtemail.sendKeys();
	}
	
	
	public void settele(String tele)
	{
		txttele.sendKeys();
	}
	
	
	public void setpwd(String pwd)
	{
		txtpasswd.sendKeys();
	}
	
	
	public void setcfpwd(String cfwd)
	{
		txtcfpassc.sendKeys();
	}
	
	public void clkagree()
	{
		chkagree.sendKeys();
	}
	
	public void clkbtcont()
	{
		btncnti.sendKeys();
	}

	public String confirmmessage() {
		try{
			return(msgconfirmation.getText());
		} catch(Exception e)
		{
			return(e.getMessage());
		}
	}
		
	
}

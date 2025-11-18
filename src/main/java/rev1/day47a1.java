package rev1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class day47a1 {
	WebDriver driver;
	
	//Constructor
	
	day47a1(WebDriver driver){
		this.driver = driver;
		
	}
	
	//locator
	
By txt_usr_loc = By.xpath("//input[@placeholder='Username']");
By txt_pas_loc	= By.xpath("//input[@placeholder='Password']");
By txt_btn_loc	= By.xpath("//button[normalize-space()='Login']");
	
//action methods
public void usrname(String user) {
	driver.findElement(txt_usr_loc).sendKeys(user);
}
public void usrpass(String pass) {
	driver.findElement(txt_pas_loc).sendKeys(pass);
}

public void usrbttn() {
	driver.findElement(txt_btn_loc).click();
}
}

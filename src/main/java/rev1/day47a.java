package rev1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class day47a {
	
	WebDriver driver;
	
	//Constructor
	
	day47a(WebDriver driver){
		this.driver=driver;	
	}
	
	// locator
	
By txt_user_loc = 	By.xpath("//input[@placeholder='Username']");
By txt_pass_loc = 	By.xpath("//input[@placeholder='Password']");
By txt_btn_loc = 	By.xpath("//button[normalize-space()='Login']");

//action methods

public void username(String name) {
	driver.findElement(txt_user_loc).sendKeys(name);
}

public void userpass(String pass) {
	driver.findElement(txt_pass_loc).sendKeys(pass);
}
	
public void bttn() {
	driver.findElement(txt_pass_loc).click();
}
	

}

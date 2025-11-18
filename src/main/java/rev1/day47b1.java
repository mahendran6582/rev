package rev1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class day47b1 {
	
	WebDriver driver;
	
	//constructor
	day47b1(WebDriver driver){
		this.driver = driver;
	}
	
	//locator
	
By txt_user_loc = By.xpath("//input[@placeholder='Username']");
By txt_pass_loc	= By.xpath("//input[@placeholder='Password']");
By bttn_loc 	= By.xpath("//button[normalize-space()='Login']");

//action method
public void username(String name) {
	driver.findElement(txt_user_loc).sendKeys(name);
	
}
public void password(String pass) {
	driver.findElement(txt_pass_loc).sendKeys(pass);
}
public void button() {
	driver.findElement(bttn_loc).click();
	
}	
	

}

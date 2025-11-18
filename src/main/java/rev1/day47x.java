package rev1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class day47x {
	
	WebDriver driver;
	
	// construtor
	
	day47x(WebDriver driver){
		this.driver = driver;
	}

	
	//locator
By txt_user_loc = By.xpath("//input[@placeholder='Username']");
By txt_pass_loc =By.xpath("//input[@placeholder='Password']");
By bttn_loc =By.xpath("//button[normalize-space()='Login']");

//action needed

public void uname(String user) {
	driver.findElement(txt_user_loc).sendKeys(user);
}
public void passw(String pwd) {
	driver.findElement(txt_user_loc).sendKeys(pwd);
}

public void button() {
	driver.findElement(txt_user_loc).click();
}
	
	
}

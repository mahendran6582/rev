package rev1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class day47m1 {
	WebDriver driver;
	//const
	day47m1(WebDriver driver){
		this.driver=driver;

	}
	
	
	//locator
	
By user_loc = By.xpath("//a[normalize-space()='OrangeHRM, Inc']");
By pass_loc = By.xpath("//input[@placeholder='Password']");
By buttons_loc = By.xpath("//button[normalize-space()='Login']");
	
//action methods

public void uuss(String user) {
	driver.findElement(user_loc).sendKeys(user);
}

public void pwd(String pass) {
	driver.findElement(pass_loc).sendKeys(pass);
}

public void bttn() {
	driver.findElement(buttons_loc).sendKeys();
}

}

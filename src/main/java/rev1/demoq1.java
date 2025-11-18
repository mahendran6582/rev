package rev1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class demoq1 {
	WebDriver driver;
	
	//constr
	demoq1(WebDriver driver){
		this.driver = driver;
		
	}
	
	//locator
By loc1 = By.xpath("//input[@placeholder='Username']");
By loc2 = By.xpath("//input[@placeholder='Password']");
By loc3 = By.xpath("//button[normalize-space()='Login']");
	
	// action methods
public void uname (String name) {
	driver.findElement(loc1).sendKeys(name);
	
}
public void passd (String pass) {
	driver.findElement(loc2).sendKeys(pass);
	
}
public void bttn () {
	driver.findElement(loc3).click();
	
}
}

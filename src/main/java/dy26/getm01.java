package dy26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getm01 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	//System.out.println(driver.getTitle());
	
	//System.out.println(driver.getCurrentUrl());
	
	//System.out.println(driver.getPageSource());
	
Set<String>	windowid = driver.getWindowHandles();
	
	System.out.println(windowid);
	

	}

}

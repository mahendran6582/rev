package dy26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//geturl
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		//gettitle
		//System.out.println(driver.getTitle());
		
		//getcurrent url
		//System.out.println(driver.getCurrentUrl());
		
		//getpagesource
	//	System.out.println(driver.getPageSource());
	
		//getwindowid
		
//String windowid = driver.getWindowHandle();
//System.out.println("windowid:" +windowid);
		
Set<String> windowids = driver.getWindowHandles();
System.out.println(windowids);

	}

}

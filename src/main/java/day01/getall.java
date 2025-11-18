package day01;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getall {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	System.out.println("Current page title: " +driver.getTitle());
	System.out.println("Current page url: " +driver.getCurrentUrl());
	System.out.println("Current pagesource: " + driver.getPageSource());
	driver.quit();
	


	

	

	}

}

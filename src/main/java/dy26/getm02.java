package dy26;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getm02 {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
//System.out.println(driver.getTitle());
//System.out.println(driver.getCurrentUrl());
//System.out.println(driver.getPageSource());

//String windowid = driver.getWindowHandle();
//System.out.println(windowid);

Set<String> windowsid = driver.getWindowHandles();
System.out.println(windowsid);

driver.quit();


	}

}

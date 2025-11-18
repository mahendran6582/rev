package Sep07;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getm1 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	
	Set<String> option = driver.getWindowHandles();
	
	List<String> opt = new ArrayList(option);
	
	String parentid = opt.get(0);
	String childid = opt.get(1);
	
	driver.switchTo().window(parentid);
	System.out.println(driver.getTitle());
	
	
	driver.switchTo().window(childid);
	System.out.println(driver.getTitle());
	
	
	
	
	

	}

}

package Sep18;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get2 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	
	Set<String> windowid = driver.getWindowHandles();
	
	List<String> win = new ArrayList(windowid);
	
	String parentid = win.get(0);
	System.out.println(parentid);
	
	String childid = win.get(1);
	System.out.println(childid);
	
	
	driver.switchTo().window(parentid);
	System.out.println(driver.getTitle());
	
	driver.switchTo().window(childid);
	System.out.println(driver.getTitle());
	
	
	
	
	
	
	
	
	
	
	

	}

}

package Aug26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gm6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> win = driver.getWindowHandles();
		List<String> window = new ArrayList(win);
		
		String parentid = window.get(0);
		String childid = window.get(1);
		
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
		
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
		
		
		
		
		

	}

}

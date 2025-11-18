package Sep35;

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
		
		Set<String> win = driver.getWindowHandles();
		
		List<String> window = new ArrayList(win);
		
		String title1 = window.get(0);
		System.out.println(title1);
		
		String title2 = window.get(1);
		System.out.println(title2);
		
		String win1 = driver.switchTo().window(title1).getTitle();
		
		System.out.println(win1);
		String win2 = driver.switchTo().window(title2).getTitle();
		System.out.println(win2);
		
		
		

	}

}

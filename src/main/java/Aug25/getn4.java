package Aug25;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getn4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowsid = driver.getWindowHandles();
		
		for(String win:windowsid) {
			
		String title = 	driver.switchTo().window(win).getTitle();
			
			if(title.equals("Human Resources Management Software | HRMS | OrangeHRM")) {
				driver.close();
			}

			
		}
		
		
		

	}

}

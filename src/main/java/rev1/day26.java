package rev1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day26 {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();


Set<String> win = driver.getWindowHandles();

for(String winm:win) {
	String title = driver.switchTo().window(winm).getTitle();
	System.out.println(driver.getTitle());
	if(title.equals("Human Resources Management Software | OrangeHRM HR Software")) {
		driver.close();
	}
	
}


	}

}

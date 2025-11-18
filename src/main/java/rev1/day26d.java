package rev1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day26d {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
Set<String> windowid = driver.getWindowHandles();
for(String winn:windowid) {
	String title = driver.switchTo().window(winn).getTitle();
	System.out.println(driver.getTitle());
	if(title.equals("Human Resources Management Software | OrangeHRM HR Software")) {
		driver.close();
	}
}


	}

}

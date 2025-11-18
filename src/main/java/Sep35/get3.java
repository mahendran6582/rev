package Sep35;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> window = driver.getWindowHandles();
		List<String> win = new ArrayList(window);
				
	
for(String wd: win)	
{

	String title = driver.switchTo().window(wd).getTitle();
	System.out.println(title);
	
	if(title.equals("Human Resources Management Software | HRMS | OrangeHRM"))
	{
		driver.close();
	}
	
}
	}

}

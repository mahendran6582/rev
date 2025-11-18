package Aug25;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getn3 {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

Set<String> window = driver.getWindowHandles();
List<String> win = new ArrayList(window);
String parentid = win.get(0);
String childid = win.get(1);

driver.switchTo().window(childid);
System.out.println(driver.getTitle());

driver.switchTo().window(parentid);
System.out.println(driver.getTitle());







	}

}

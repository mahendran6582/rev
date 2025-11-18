package revv01;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class whandles01 {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

Set<String> windowid = driver.getWindowHandles();
List<String> win = new ArrayList(windowid);

String childid = win.get(0);
String parentid = win.get(1);

System.out.println(driver.switchTo().window(childid).getTitle());

System.out.println(driver.switchTo().window(parentid).getTitle());


	}

}

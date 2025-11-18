package Aug26;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navall {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
	}

}

package day04;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateall {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.navigate().to("https://demo.nopcommerce.com/");
driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();


	}

}

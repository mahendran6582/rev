package Sep47;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myacc {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/en-gb?route=common/home");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//span[normalize-space()=\"My Account\"]")).click();
		
		

	}

}

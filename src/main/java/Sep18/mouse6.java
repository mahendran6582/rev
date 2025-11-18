package Sep18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		WebElement lowproce = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		
		System.out.println(lowproce.getLocation());
		
	Thread.sleep(5000);
	
		Actions act = new Actions(driver);
		act.dragAndDropBy(lowproce, -100,194).perform();
		
		System.out.println(lowproce.getLocation());

	}

}

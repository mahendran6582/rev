package Sep10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		
		WebElement minslider = driver.findElement(By.xpath("//span[@xpath= '1']"));
		System.out.println("Minslider current lcation" +minslider.getLocation());
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(minslider, 100, 280).perform();
		
		
		System.out.println("Minslider updated lcation" +minslider.getLocation());
		
		WebElement maxslider = driver.findElement(By.xpath("//span[2]"));
		System.out.println("Maxslider current lcation" +maxslider.getLocation());
		
		act.dragAndDropBy(maxslider, -100, 280).perform();
		
		
		System.out.println("Maxslider updated lcation" +maxslider.getLocation());
		
	}

}

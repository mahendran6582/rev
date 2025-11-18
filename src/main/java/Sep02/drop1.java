package Sep02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop1 {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
WebElement dropele = driver.findElement(By.xpath("//select[@id='country']"));

Select drop = new Select(dropele);
//drop.selectByVisibleText("Germany");
//drop.selectByIndex(9);
drop.selectByValue("japan");





	}

}

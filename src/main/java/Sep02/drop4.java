package Sep02;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop4 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();

WebElement drop = driver.findElement(By.xpath("//select[@id='country']"));

Select dropd = new Select(drop);
dropd.selectByIndex(2);
Thread.sleep(5000);
dropd.selectByValue("japan");
Thread.sleep(5000);
dropd.selectByVisibleText("France");

List <WebElement>opt = dropd.getOptions();

System.out.println(opt.size());




	}

}

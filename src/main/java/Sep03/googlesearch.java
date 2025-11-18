package Sep03;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class googlesearch {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.google.com");
driver.manage().window().maximize();
WebElement search = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
search.sendKeys("Selenium");
Thread.sleep(7000);
List<WebElement> options= driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));

System.out.println(options.size());

for(int i=0;i<options.size();i++) {
	System.out.println(options.get(i).getText());

if(options.get(i).getText().equals("selenium foods")) {
	options.get(i).click();
	break;
}
}
	}

}

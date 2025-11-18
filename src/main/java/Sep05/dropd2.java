package Sep05;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropd2 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control' and @id = 'country']"));
	
	Select drop = new Select(dropdown);
	
	List<WebElement> dd = drop.getOptions();
	System.out.println(dd.size());
	

for(int i=0;i<dd.size();i++) {
	
	System.out.println(dd.get(i).getText());
	
	
}
	
	
	
	
	
	

	}

}

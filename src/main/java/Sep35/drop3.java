package Sep35;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		

		WebElement dd= driver.findElement(By.xpath("//select[@id='country']"));

		Select drop = new Select(dd);

		List<WebElement> val = drop.getOptions();
		System.out.println(val.size());

		for(int i=0;i<val.size();i++)
		{
			System.out.println(val.get(i).getText());
			
			
		}








	}

}

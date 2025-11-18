package Sep18;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@class = 'form-control' and @id='country']"));

	Select select = new Select(dropdown);
	
	List<WebElement> dt = select.getOptions();
	
	for(WebElement dd: dt)
	{
		String values = dd.getText();
System.out.println(values);
	
	

	}

}
}


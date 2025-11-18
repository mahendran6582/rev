package Sep18;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesea {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		
	List<WebElement> drops = driver.findElements(By.xpath("//div[@role='presentation']//ul//li"));
	
	System.out.println(drops.size());

		for(int i=0;i<drops.size();i++) {
			String values = drops.get(i).getText();
			System.out.println(values);
			if(drops.get(i).getText().equals("selenium toxicity"))
			{
				drops.get(i).click();
				break;
				
			}
			
			
		}
		
		
		
		

	}

}

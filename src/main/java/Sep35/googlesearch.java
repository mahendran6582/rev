package Sep35;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearch {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
	
	List<WebElement> sear = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	

for(int i=0;i<sear.size();i++)
{
	String val = sear.get(i).getText();
System.out.println(val);

	if(sear.get(i).getText().equals("selenium toxicity"))
	{
		sear.get(i).click();
		break;
	}
			
	
	
	}
	}

}

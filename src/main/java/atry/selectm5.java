package atry;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectm5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
System.out.println(options.size());

for(int i=0;i<options.size();i++) {
	String title = options.get(i).getText();
	System.out.println(title);
	
	if(title.equals("selenium")) {
		options.get(i).click();
	}
	
		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();");
		
	
}


	}

}

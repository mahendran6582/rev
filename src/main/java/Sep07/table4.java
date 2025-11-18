package Sep07;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/dynamic-pagination-table");
		driver.manage().window().maximize();
		
		String dat = driver.findElement(By.xpath("//div[@id='example_info']")).getText();
		System.out.println(dat);
		
		int total = Integer.parseInt(dat.substring(dat.lastIndexOf("of")+3,dat.indexOf("entries")).trim());
		
		for(int p=1;p<=2;p++) {
			if(p>1)
			{
				WebElement actpage = driver.findElement(By.xpath("//a[normalize-space()="+p+"]"));
				actpage.click();
				Thread.sleep(4000);
				
			}
			
			
		}
		
		
		
		
		

	}

}

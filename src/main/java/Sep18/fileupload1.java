package Sep18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jumpshare.com/file-sharing/txt");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("[@type='file']")).sendKeys("C:\\Automation\\automationFiles\\tm1.txt");
		
		if(driver.findElement(By.xpath("jfjkjkfhkf")).getText().equals("lkfjkjgfdgg"))
		{
			System.out.println("lkjflkjflkdsjf");
		}
		else {
			System.out.println("not uploaded");
			
			
		}
		
		
		
		
		

	}

}

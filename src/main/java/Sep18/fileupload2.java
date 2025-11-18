package Sep18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jumpshare.com/file-sharing/txt");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
String file1 = 		"C:\\Automation\\automationFiles\\tm1.txt";
	String file2 = "C:\\Automation\\automationFiles\\tm2.txt";
	
	driver.findElement(By.xpath("[@type='file']")).sendKeys(file1+"\n"+file2);
	
	

		
		int fileupload = driver.findElements(By.xpath("jfjkjkfhkf")).size();
		if(fileupload ==2)
		{
			System.out.println("All files is uploaed");
		}
		else {
			System.out.println("file is not uploaded");
			
			
		}
		

	}

}

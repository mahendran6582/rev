package revv01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src ='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome1");
		driver.switchTo().defaultContent();
		
		
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src ='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome2");
		driver.switchTo().defaultContent();
		
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src ='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome3");
		
driver.switchTo().defaultContent();
		
		
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src ='frame_4.html']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome4");
		
		driver.switchTo().defaultContent();
		
	
	driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
	
		
		
		
		
		
		
		

	}

}

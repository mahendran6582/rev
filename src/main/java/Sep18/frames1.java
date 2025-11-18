package Sep18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	

	WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	
	driver.switchTo().frame(frame1);
		
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome123");
	

	driver.switchTo().defaultContent();
	
		
	WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	
	driver.switchTo().frame(frame2);
	
	driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Welcome345");
	
	driver.switchTo().defaultContent();
	
	WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver.switchTo().frame(frame3);
	
	driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Welcome789");
	
	//driver.switchTo().defaultContent();
	/*
	
	WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
	driver.switchTo().frame(frame4);
	
   driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Welcome0000"); */

   //driver.switchTo().defaultContent();
   //Thread.sleep(5000);
   
	
	driver.switchTo().frame(0);
	
	driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
	
	
	
	}

}

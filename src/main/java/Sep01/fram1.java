package Sep01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fram1 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.manage().window().maximize();
	//frame1
	WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("frame1_abc");
	
	driver.switchTo().defaultContent();
	
	//frame2
	WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	driver.switchTo().frame(frame2);
	driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("frame2_abc");
	
	driver.switchTo().defaultContent();
	
	//frame3
	WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver.switchTo().frame(frame3);
	driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("frame3_abc");
driver.switchTo().frame(0);
	
	
	driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
	driver.switchTo().defaultContent();
	//frame4
	WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
	driver.switchTo().frame(frame4);
	driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("frame4_abc");
	
	driver.switchTo().defaultContent();
	
	JavascriptExecutor js = (javascriptExecutor)driver;
	js.executeScript("arguments[0].click();",rdbutton);
	
	
	
	}

}

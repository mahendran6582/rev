package Sep35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class table3 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int noofrows = driver.findElements(By.xpath("//table[@name='BookTable']//tr//td")).size();
		System.out.println(noofrows);
		
		
		int noofcolumn = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
		System.out.println(noofcolumn);
		
		
		for(int r=2;r<=noofrows;r++)
			
		{
			String val = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(val.equals("Mukesh")) 
				{
					String col = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
					System.out.println(val+ "\t"+ col);
				}
			
		}
		}
		
	}



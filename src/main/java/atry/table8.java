package atry;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class table8 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		int rows = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr")).size();
		int column = driver.findElements(By.xpath("//table[@name = 'BookTable']//th")).size();
		
		for(int r=2;r<=rows;r++) {
			String data1 = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+r+"]/td[2]")).getText();
			
			if(data1.equals("Mukesh")){
				String bookname = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+r+"]/td[1]")).getText();
				System.out.println(bookname+ "\t"+  data1);
			}
		}
		
	}

}

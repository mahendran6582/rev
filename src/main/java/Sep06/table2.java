package Sep06;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class table2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(rows);

		int column = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println(column);

		//WebElement value1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]/td[3]"));
		//System.out.println(value1.getText());

		for(int r=2;r<=rows;r++) {
		String values1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
//System.out.println(values1);
if(values1.equals("Mukesh")) {
	String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
	System.out.println(bookname+ "\t"+ values1);



}


		}
		

	}

}

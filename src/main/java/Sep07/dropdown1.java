package Sep07;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
WebElement check = driver.findElement(By.xpath("//select[@id='country']"));

Select che = new Select(check);
List<WebElement> ccc = che.getOptions();


for(int i=0;i<ccc.size();i++) {
	System.out.println(ccc.get(i).getText());
	
}












//Select che = new Select(check);




/*


che.selectByVisibleText("Japan");
Thread.sleep(4000);
che.selectByIndex(3);
Thread.sleep(4000);
che.selectByValue("brazil");

int val1= che.getOptions().size();
System.out.println(val1);

*/







	}

}

	



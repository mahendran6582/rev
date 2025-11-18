package Sep02;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop2 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	WebElement drop = driver.findElement(By.xpath("//select[@id='country']"));
	Select dropdown = new Select(drop);
//	dropdown.selectByVisibleText("");
//	dropdown.selectByIndex(0);
//	dropdown.selectByValue("japan");
	List<WebElement> opt=dropdown.getOptions();
	System.out.println("total values available:"+ opt.size());
	
	//for(int i=0;i<opt.size();i++) {
		//System.out.println(opt.get(i).getText());
//	for(WebElement op:opt) {
	//	System.out.println(op.getText());
		
		
		
	}
	
	
	
	

	}

}

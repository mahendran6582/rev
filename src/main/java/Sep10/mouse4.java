package Sep10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse4 {

	public static void main(String[] args) {
WebDriver driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://testpages.eviltester.com/styled/drag-drop-javascript.html");
driver.manage().window().maximize();

WebElement dragme1 = driver.findElement(By.xpath("//div[@id='draggable1']//p[contains(text(),'Drag me')]"));
WebElement dropme1 = driver.findElement(By.xpath("//div[@id='droppable1']"));

Actions act = new Actions(driver);

act.dragAndDrop(dragme1, dropme1).build().perform();









	}

}

package Sep18;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcelFDCalcul {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/hsbc/fixed-deposit-calculator-ZZZ-BHS001.html?classic=true");
		driver.manage().window().maximize();
		
	String	filepath = System.getProperty("user.dir")+"\\testdata\\DDTesting.xlsx";
		
	int rows = ExcelUtils.getRowCount(filepath, "Sheet1");
	
	for(int i=1;i<=rows;i++) 
	
	{
		String princ = ExcelUtils.getCellData(filepath, "Sheet1", i, 0);
		String ratin = ExcelUtils.getCellData(filepath, "Sheet1", i, 1);
		String perd1 = ExcelUtils.getCellData(filepath, "Sheet1", i, 2);
		String perd2 = ExcelUtils.getCellData(filepath, "Sheet1", i, 3);
		String freqy = ExcelUtils.getCellData(filepath, "Sheet1", i, 4);
		String expvl = ExcelUtils.getCellData(filepath, "Sheet1", i, 5);
		
		//
		driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(princ);
		driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(ratin);
		driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(perd1);
		
		Select pd = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
		pd.selectByVisibleText(perd2);
		
		Select freq = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
		freq.selectByVisibleText(freqy);
		
		driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
		
				//validation
		
		String actualval = driver.findElement(By.xpath("//span[@id='resp_matval']")).getText();
		
		if(Double.parseDouble(expvl)==Double.parseDouble(actualval))
		{
			
			System.out.println("Test Passed");
			ExcelUtils.SetCellData(filepath, "Sheet1", i,7, "Passed");
			ExcelUtils.fillGreenColor(filepath, "Sheet1", i, 7);
		}
		
		else
		{
			System.out.println("Test Failed");
			ExcelUtils.SetCellData(filepath, "Sheet1", i,7, "Failed");
			ExcelUtils.fillRedColor(filepath,"Sheet1", i, 7);
		}
		
		driver.findElement(By.xpath("//img[@class='PL5']")).click();
	}
	driver.quit();

	}

}

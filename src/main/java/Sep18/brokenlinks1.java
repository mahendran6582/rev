package Sep18;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;



/*
 1. Link href = "https://xyz.com"
 2. hit to server
 3.>=400 brokenlink
 4.<400 not brokenlink
 
 */

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("total no.of links:" +links.size());
		
		int noofbrokenlinks =0;
		
		for(WebElement linkelement: links)
		{
			String hrefval = linkelement.getAttribute("href");
			
			if(hrefval==null || hrefval.isEmpty())
			{
				System.out.println("hrefval is null or empty. not possible to check");
				continue;
			}
		
			
			try 
		{
				
			
			//hit url to server
				
				URL linkurl = new URL(hrefval);//convert href string to url format
						
			HttpURLConnection connlink = (HttpURLConnection) linkurl.openConnection(); //openconnection to the server
			
			connlink.connect(); //request to server
			
		if(connlink.getResponseCode()>=400)
				{
			System.out.println(hrefval+ "Brokenlink");
			noofbrokenlinks++;
				}
		else
		{
			System.out.println(hrefval+ "Not Brokenlink");
		}
			}
			catch(Exception e)
			{
				
			}
		}
			
			System.out.println("noofbrokenlinks" +noofbrokenlinks);
		
					}
		
			}



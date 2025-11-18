/*package Tc26;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_003_TestDD extends BaseClass{

	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void datadriven(String user, String pwd, String exp) throws InterruptedException, IOException {
	
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setlogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setemail(user);
		lp.setpass(pwd);
		lp.setlogin();
		
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    Files.copy(src.toPath(), Paths.get("afterLogin.png"));
		    
		    System.out.println("URL after login = " + driver.getCurrentUrl());
		
		MyAccountPage mp = new MyAccountPage(driver);
		boolean mess = mp.setmess();
		Thread.sleep(5000);
				
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(mess==true)
			{
			mp.setlogout();
			Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("InValid"))
		{
			if(mess==true)
			{
			mp.setlogout();
			Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		
		}
	} */

package Tc26;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_003_TestDD extends BaseClass {

    @Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
    public void datadriven(String user, String pwd, String exp) {

        HomePage hp = new HomePage(driver);
        hp.setmyaccount();
        hp.setlogin();

        LoginPage lp = new LoginPage(driver);
        lp.setemail(user);
        lp.setpass(pwd);
        lp.setlogin();

        // ===============================
        // 📸 TAKE SCREENSHOT AFTER LOGIN
        // ===============================

        try {
            Thread.sleep(2000);  // wait for page load
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(src.toPath(), Paths.get("./screenshots/afterLogin.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check login result
        MyAccountPage mp = new MyAccountPage(driver);
        boolean mess = mp.setmess();

        if (exp.equalsIgnoreCase("Valid")) {
            if (mess == true) {
                mp.setlogout();
                Assert.assertTrue(true);
            } else {
                Assert.assertTrue(false);
            }
        }

        if (exp.equalsIgnoreCase("InValid")) {
            if (mess == true) {
                mp.setlogout();
                Assert.assertTrue(false);
            } else {
                Assert.assertTrue(true);
            }
        }
    }
}

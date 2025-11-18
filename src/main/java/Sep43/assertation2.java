package Sep43;

import static org.testng.Assert.assertEquals;

// assertion in if condtions fail

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertation2 {
	
	@Test
	
	void value()
	{
		String exp_val = "Expected";
		String act_va1 = "Expected";
		
	if(exp_val.equals(act_va1))
		{
			System.out.println("System passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("System failed");
			Assert.assertTrue(false);
		}
	
		
		
		
	}
	

}

package Sep43;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;


//Assertion
public class assertation1 {
	
	@Test()
	
	void value()
	{
		String exp_val = "Expected";
		String act_va1 = "Actual";
		
	/*	if(exp_val.equals(act_va1))
		{
			System.out.println("System passed");
		}
		else
		{
			System.out.println("System failed");
		}
		*/
		
	//	Assert.assertEquals(exp_val, act_va1);
		Assert.assertNotEquals(exp_val, act_va1);
		
		
	}
	

}

package Sep43;

import static org.testng.Assert.assertEquals;

//soft assertion

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class assertation4 {
	
	@Test
	
	void value()
	{
	
		System.out.println("testing");
		System.out.println("testing");
		
		// Assert.assertEquals(1, 2);
		
	SoftAssert ac = new SoftAssert();
		
		ac.assertEquals(1, 2);
		
		System.out.println("testing");
		System.out.println("testing");
		ac.assertAll();
		
	}
	
	}
	
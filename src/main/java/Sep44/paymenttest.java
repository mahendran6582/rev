package Sep44;

import org.testng.annotations.Test;

public class paymenttest {
	@Test(priority =1,groups = {"sanity","regression","functional"})
	void paymentinrupees ()
	{
		System.out.println("paymentinrupees");
		
	}
	@Test(priority =2,groups = {"sanity","regression","functional"})
	void paymentincard ()
	{
		System.out.println("paymentincard");
		
	}
	@Test(priority =3,groups = {"sanity","regression","functional"})
	void paymentpaypal ()
	{
		System.out.println("paymentpaypal");
		
	}
}

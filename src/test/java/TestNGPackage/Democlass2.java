package TestNGPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Democlass2 {
	
	@Test(groups="Smoke")
	public void demo3()
	{
		System.out.println("Demo 3");
	}
	
	@Test
	public void demo4()
	{
		System.out.println("Demo 4");
	}
	
	
	/*@DataProvider
	public void getData()
	{
		//Defining array with 3 rows(Total data combinations) and 2 columns(Number of values for each combinations)
		Object[][] data = new Object[3][2];
		
		
	}*/

}

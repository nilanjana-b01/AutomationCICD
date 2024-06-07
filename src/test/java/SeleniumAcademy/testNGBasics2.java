package SeleniumAcademy;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testNGBasics2 {
	
	@Test(priority=0)
	public void thirdTest()
	{
		System.out.println("Third Test");
	}
	
	@Test(priority=1)
	public void fourthTest()
	{
		System.out.println("Fourth Test");
	}
	
	
	
	/*@AfterMethod
	public void lastToExecuteafterEachTestCase()
	{
		System.out.println("Last To execute after each test case");
	}*/
	
	@AfterSuite
	public void lastToExecuteafterallnsidesuite()
	{
		System.out.println("Last To execute AFTER all test cases Inside the SUITE AFTER SUITE");
	}
	@BeforeSuite
	public void firstToExecutebeforeallnsidesuite()
	{
		System.out.println("First To execute BEFORE all test cases Inside the SUITE BEFORE SUITE");
	}


}

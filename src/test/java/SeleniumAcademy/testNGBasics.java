package SeleniumAcademy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGBasics {
	
	@Test
	public void firstTest()
	{
		System.out.println("First Test");
	}
	
	@BeforeTest
	public void firstToExecute()
	{
		System.out.println("First To execute BEFORE TEST");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("headless");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		LoginPage loginPage=new LoginPage(driver);
		
		loginPage.loginDetails("nilroy@gmail.com", "Nilanjana@29");
		
	}
	
	@BeforeClass
	public void firstToExecuteBeforeCLass()
	{
		System.out.println("First To execute BEFORE CLASS");
	}
	
	@BeforeMethod
	public void firstToExecuteBeforeEachTestCase()
	{
		System.out.println("First To execute before each test case : BEFORE METHOD");
	}
	
	@Test
	public void secondTest()
	{
		System.out.println("Second Test");
	}
	
	@AfterClass
	public void lastToExecuteafterCLass()
	{
		System.out.println("Last To execute AFTER CLASS");
	}
	
	@AfterTest
	public void lastToExecute()
	{
		System.out.println("Last To execute after all test cases : AFTER TEST");
	}

}

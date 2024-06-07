package TestNGPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Democlass1 extends Base{
	
	
	/*@Test(dependsOnMethods= {"demo10"})
	public void demo1()
	{
		System.out.println("Demo 1");
	}
	/*@Parameters({"URL"})
	@Test
	public void demo2(String urlname)
	{
		System.out.println("Demo 2");
		System.out.println(urlname);
		
	}*/
	
	@Test
	public void demo10()
	{
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Demo 10");
	}

}

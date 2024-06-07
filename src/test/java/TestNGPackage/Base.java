package TestNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Base {
	
	public static WebDriver driver=null;
	
	
	public void launchBrowser()
	{
		driver = new ChromeDriver();
	}

}

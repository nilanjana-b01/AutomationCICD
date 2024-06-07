package SeleniumAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestNeg {
	
	/*public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		LoginPage loginPage=new LoginPage(driver);
		
		loginPage.loginDetails("nilroy@gmail.com", "Nilanjana@29");
		
	}*/
	@Test
	public void loginToPage()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		LoginPage loginPage=new LoginPage(driver);
		
		loginPage.loginDetails("nilroy@gmail.com", "@29");
		
	}
}

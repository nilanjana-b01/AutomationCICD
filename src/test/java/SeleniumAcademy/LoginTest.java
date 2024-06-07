package SeleniumAcademy;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import SeleniumAcademy.data.DataReader;

public class LoginTest {
	
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		LoginPage loginPage=new LoginPage(driver);
		
		loginPage.loginDetails("nilroy@gmail.com", "Nilanjana@29");
		
	}
	@Test(groups= {"Login"})
	public void loginToPage()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		LoginPage loginPage=new LoginPage(driver);
		
		loginPage.loginDetails("nilroy@gmail.com", "Nilanjana@29");
		
	}
	/*
	@Test(dataProvider="getData")
	public void loginToPage(HashMap<String, String> input)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		LoginPage loginPage=new LoginPage(driver);
		
		loginPage.loginDetails(input.get("email"), input.get("pwd"));
		
	}
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		/*HashMap<String, String> map1 = new HashMap();
		map1.put("email", "nilroy@gmail.com");
		map1.put("pwd", "Nilanjana@29");
		HashMap<String, String> map2 = new HashMap();
		map2.put("email", "ni@gmail.com");
		map2.put("pwd", "Nilanjaa@29");*/

		/*DataReader dr= new DataReader();
		List<HashMap<String, String>> data= dr.getJsonDataToMap(System.getProperty("user.dir")+"\\src\\test\\java\\SeleniumAcademy\\data\\Login.json");
		return new Object[][] {{data.get(0)},{data.get(1)}};
	}
	
	
	//Screenshot Utility
	
	public String getScreenshot(String testCaseName) throws IOException
	{
		WebDriver driver= new ChromeDriver();
		//Driver casted to TakesScreenshot in order to take screen shot
		TakesScreenshot ts= (TakesScreenshot)driver;
		//Selenium took screenshot and storecd in local File
		File source = ts.getScreenshotAs(OutputType.FILE);
		//Copying the local file to workspace
		File copyFile = new File(System.getProperty("user.dir")+ "//reports//"+ testCaseName +".png");
		FileUtils.copyFile(source, copyFile);
		//Returning the path where the screenshot is stored
		return System.getProperty(("user.dir")+ "//reports//"+ testCaseName +".png");
		
		
		
	}*/
}

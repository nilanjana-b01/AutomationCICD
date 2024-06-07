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

public class LoginTest2 {
	
	/*
	
	@Test(dataProvider="LoginData")
	public void loginToPage(String username, String password)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		LoginPage loginPage=new LoginPage(driver);
		
		loginPage.loginDetails(username, password);
		
	}
	
	@DataProvider(name="LoginData")
	public Object[][] getData() throws IOException
	{
		return new Object[][]{{"nilroy@gmail.com", "Nilanjana@29"},{"ni@gmail.com","Nilanjaa@29"}};
	}*/
	
	@Test(dataProvider="LoginData")
	public void loginToPage(HashMap<String, String> input)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		LoginPage loginPage=new LoginPage(driver);
		//Insert Login.json variable names here
		loginPage.loginDetails(input.get("email"), input.get("pwd"));
		
	}
	
	@DataProvider(name="LoginData")
	public Object[][] getData() throws IOException
	{
		DataReader reader = new DataReader();
		List<HashMap<String, String>> data = reader.getJsonDataToMap(System.getProperty("user.dir")+"\\src\\test\\java\\SeleniumAcademy\\data\\Login.json");
		return new Object[][] {{data.get(0)},{data.get(1)}};
	}
	
	

}

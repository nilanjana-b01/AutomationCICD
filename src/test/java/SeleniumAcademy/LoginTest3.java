package SeleniumAcademy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest3 {
	
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
	
	DataFormatter formatter = new DataFormatter();
	
	@Test(dataProvider="LoginData")
	public void loginToPage(String username, String password)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginDetails(username,password);
		
	}
	
	@DataProvider(name="LoginData")
	public Object[][] getData() throws IOException
	{
		FileInputStream fis = new FileInputStream("C://Users//nilan//eclipse-workspace//ExcelWithDataProvider//demoData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int columnCount = row.getLastCellNum();
		
		Object data[][] = new Object[rowCount-1][columnCount];
		for(int i =0;i<rowCount-1;i++)
		{
			row=sheet.getRow(i+1);
			for(int j=0;j<columnCount;j++)
			{
				XSSFCell cell = row.getCell(j);
				
				data[i][j]= formatter.formatCellValue(cell);
			}
		}
		
		return data;
	}
	
	

}

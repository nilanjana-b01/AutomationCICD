package SeleniumAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggestiveDropdown {
	@Test
	public void selectDD() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		StaticDropdownPage ddpage = new StaticDropdownPage(driver);
		ddpage.selectFromCCyDropdown("USD");
		

	}

}

package SeleniumAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdownPage {
	WebDriver driver;
	public StaticDropdownPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="ctl00_mainContent_DropDownListCurrency")
	WebElement Currency;
	
	public void selectFromCCyDropdown(String Ccy)
	{
		Select dropDown = new Select(Currency);
		dropDown.selectByValue(Ccy);
	}
	
	
	

}

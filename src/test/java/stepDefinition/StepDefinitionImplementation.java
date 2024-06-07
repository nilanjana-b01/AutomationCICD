package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumAcademy.LoginPage;
import TestNGPackage.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionImplementation extends Base {
	
	

	@Given("I landed on Academy website")
	public void I_landed_on_Academy_website()
	{
		
		launchBrowser();
	}
	
	@Given("the website of academy")
	public void the_website_of_academy()
	{
		
		
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
	}
	
	@When("^user is entering username (.+) and password (.+)$")
	public void user_is_entering_username_and_password(String username, String password)
	{
		LoginPage loginPage=new LoginPage(driver);
		
		loginPage.loginDetails(username, password);
	}
	
	@Then("user is able to view the academy content")
	public void viewcontent()
	{
		
	}

}

package SeleniumAcademy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
		
	//WebElement userID = driver.findElement(By.id("userEmail"));
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="userEmail")
	WebElement userID;
	
	@FindBy(id="userPassword")
	WebElement userpwd;
	
	//@FindBy(id="login")
	@FindBy(xpath="//input[@name='login']")
	WebElement login;
	
	public void loginDetails(String username, String password) {
		userID.sendKeys(username);
		userpwd.sendKeys(password);
		login.click();
    }

	

}

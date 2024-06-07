package SeleniumAcademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitTest {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		
		//implicit wait syntax
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Explicit WebDriverWait syntax
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		w.until((ExpectedConditions.visibilityOfElementLocated(By.id(""))));
		
		//Explicit FluentWait syntax
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

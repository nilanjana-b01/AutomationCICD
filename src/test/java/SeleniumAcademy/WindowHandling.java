package SeleniumAcademy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class = 'blinkingText']")).click();
		
		//getWindowHandle() method gives current window/parent window
		String parentWindow = driver.getWindowHandle();
		
		
		
		
		//String paraText = "";
		
		//getWindowHandles() method gives all open windows
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		//to continue execution throughout all available windows use while condition
		while(it.hasNext())
		{
			String childWindow = it.next();
			if(!parentWindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				//paraText= driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
				//System.out.println("Email ID is "+paraText);
			}
		}
				
		/*String parentID = iterator.next();
		String childID = iterator.next();
		driver.switchTo().window(childID);*/
		Thread.sleep(3000);
		String paraText= driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println("Email ID is "+paraText);
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("username")).sendKeys(paraText);
		
		
		
		
	}

}

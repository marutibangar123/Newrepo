import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_iframe 
{
	
	
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Maruti\\Desktop\\selenium file\\chromedriver.exe\\");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/default.asp");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
	
	
		
		
		
		
		
	}

}

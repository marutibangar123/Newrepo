package pattern_practice;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Client_round 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maruti\\Desktop\\selenium file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		List <WebElement> web =	driver.findElements(By.xpath("//div[@class='_8esk']"));
		System.out.println(web.size());
	for(WebElement link:web)
	{
	String str =	link.getText();
	System.out.println(str);
	
	}
		
	}
	
	
	
}






package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipalLink 
{
public static void main(String[] args) 

{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Maruti\\Desktop\\selenium file\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	List<WebElement> links= driver.findElements(By.xpath("//a"));
	
	System.out.println(links.size());
	
	for(WebElement link:links)
	{
		System.out.println(link.getText());
	}
}
}


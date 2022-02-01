package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo 
{
	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maruti\\Desktop\\selenium file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver .get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	List<WebElement> list =	driver.findElements(By.xpath("//a"));
	
	System.out.println(list.size());
	
WebElement list1 =	driver.findElement(By.xpath("//*[@class='_8esk']"));

String text =list1.getText();
System.out.println(text);
		
	}

}

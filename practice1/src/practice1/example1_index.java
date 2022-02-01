package practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_index

{
public static void main(String[] args) throws InterruptedException
{
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maruti\\Desktop\\selenium file\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.makemytrip.com/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//li[@data-cy='account']")).click();
	
	driver.findElement(By.xpath("//a[text()='Search']")).click();
	
	
	
	driver.findElement(By.xpath("((//div[@class='fli-list  simpleow '])[9]//div)[5]")).click();
	
}
}
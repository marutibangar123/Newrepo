import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElement
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Maruti\\\\Desktop\\\\selenium file\\\\chromedriver.exe\\\\");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/s?k=redmi+9+power&i=electronics&ref=nb_sb_ss_c_2_2_ts-doa-p");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//	String text =	driver.findElement(By.xpath("((//div[@class='a-section a-spacing-medium'])[2]//span)[6]")).getText();
	
	//System.out.println(text);
	}

}


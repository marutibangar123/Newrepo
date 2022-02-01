package practice1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample3_Priority_keyword
{
	@Test()       //3rd execute
	public void TC2()
	{
	Reporter.log("running TC2..", true);
  }
	
	@Test  // 4th execute
	public void TC1()
	{
	Reporter.log("running TC1",true);
	}
	
	@Test  (priority=1)    //default priority = 0
	public void TC3()     // second execute
	{
    Reporter.log("running TC3..", true);
	}
	
	@Test(priority=0) // first execute
	public void TC4()     
	{
		
		Reporter.log("running TC4..",true);

}
}
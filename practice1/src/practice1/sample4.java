package practice1;

import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4
{
	public static void main(String[] args)
	{
		String str = "mera mera bharat mahan hai hai";
		
		String ar[] =str.split(" ");
		
		HashMap <String,Integer> mp = new HashMap<String,Integer>();
		
		for(int i=0;i<=ar.length-1;i++)
		{
			String maruti = ar[i];
		
		if(mp.containsKey(maruti))
		{
			mp.put(maruti, mp.get(maruti)+1);
		}
		else
		{
			mp.put(maruti, 1);
		}
		
	}
		
	Set<String>	keys =mp.keySet();
	
	for(String key:keys)
	{
	
	System.out.println(key+" :"+mp.get(key));
	
	ChromeDriver driver = new ChromeDriver();
	

}
}}

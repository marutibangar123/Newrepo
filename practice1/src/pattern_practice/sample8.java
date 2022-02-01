package pattern_practice;

public class sample8
{
	public static void main(String[] args) 
	{
		String org = "abcdef";
		
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--)
		{
		rev = rev+ org.charAt(i);
		
		}
		System.out.println(rev);
		
		
	
	}	

}

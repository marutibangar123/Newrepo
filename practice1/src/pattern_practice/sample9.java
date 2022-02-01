package pattern_practice;

public class sample9
{
	public static void main(String[] args) 
	{
		String orgnum="1234";
		
		String rev="";
		
		for(int i=orgnum.length()-1;i>=0;i--)
		{
			rev= rev+orgnum.charAt(i);
		}
System.out.println(rev);
	}

}

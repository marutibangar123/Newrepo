package practice1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate_value_frome_Arraylist
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(1);
		al.add(3);
		al.add(5);
		al.add(7);
		al.add(7);
		
		System.out.println("List With duplicate"+al);
		
	Set<Integer> set = new LinkedHashSet<Integer>(al);  // LinkedHashSet does not allow the duplicate value
	
	al.clear();    // clear arraylist
	
	al.addAll(set);  // Add all element in Arraylist without duplication
	
	System.out.println("List Without duplicate"+al);
		
	}

}
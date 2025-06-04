package Practice;

import java.util.HashMap;

public class T2_Program {
	
	/*
	
	How do you get distinct characters and their count in a string in Java?
You can create the character array from the string. Then iterate over it and create a HashMap with the character as key and their count as value. The following example code shows how to extract and count the characters of a string:

String str1 = "abcdABCDabcd";
	 */
	public void testMethod(String str)
	{
		HashMap<Character, Integer> map = new HashMap<>();
		char[] chars = str.toLowerCase().toCharArray();
		for(char c : chars)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c,1);
			}
		}
		System.out.println("map : "+map);
	}
	//palindrome
	public void testMethod2(String str2)
	{
		for(int i=0; i<str2.length()/2;i++)
		{
			for(int j=str2.length()-1; j>str2.length()/2; j--)
			{
				/*if(str2.g==str2[j])
				{
				
				}*/
			}
		}
	}
	public static void main(String[] args) {
		String str = "abcdABCDabcd";
		new T2_Program().testMethod(str);
		String str2 = "madam";
		//new Tests.T2_Program().testMethod2();
	}

}

package Interviews;

import java.util.HashMap;
import java.util.Map;

//4. Write a Java program to count the frequency of each word in a text file.
public class Test2 {

	public void count(String [] words)
	{
		Map<String,Integer> map = new HashMap<>();
		for(int i=0; i<words.length; i++)
		{
			if(map.containsKey(words[i]))
			{
				map.put(words[i], map.get(words[i])+1);
			}
			else
			{
				map.put(words[i],1);
			}
		}
		System.out.println("Frequency Map : "+map);
	}
	
	public static void main(String[] args) {
		String [] words = {"CSE", "CSE" , "IT", "FINANCE", "CSE", "IT"};
		new Test2().count(words);
	}
}

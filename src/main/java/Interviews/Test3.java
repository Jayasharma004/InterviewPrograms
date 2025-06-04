package Interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		List<Integer> evenNums = new ArrayList<Integer>();
		evenNums = nums.stream().filter(n->n%2 == 0).collect(Collectors.toList());
		System.out.println("Even integers : "+evenNums);
		
		int[] arr ={16,17,3,4,5,2}; //output - 17,5,2
		List<Integer> leaderList = new ArrayList<>();
		boolean flag = false;
		for(int i=0; i< arr.length; i++)
		{
			flag = true;
			for(int j=i+1; j< arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					flag = false;
				}
			}
			if(flag)
			{
				leaderList.add(arr[i]);
			}
		}
		System.out.println("leaderList : "+leaderList);
	}
}

package Practice;

import java.util.Arrays;

//Maersk Interview
public class T4_Maersk_SumOfEvenIntegersJava8 {

	public static void sumOfEvenIntegers(int[] arr)
	{
		int sumOfEvens = Arrays.stream(arr) // Create a stream from the array
				                 .filter(num -> num % 2 == 0)     // Filter to include only even numbers
				                 .sum();                         // Sum up the remaining numbers
		// Output the result
		System.out.println("Sum of even numbers: " + sumOfEvens);
	}
	
	public static void main(String[] args) {
		int []arr = {1,4,7,8,9,6};
		sumOfEvenIntegers(arr);
	}
}

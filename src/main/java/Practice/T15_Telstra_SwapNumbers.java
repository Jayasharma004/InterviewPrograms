package Practice;

public class T15_Telstra_SwapNumbers {
	
		public static void main(String[] args) {
//Swap variables
			int a = 5, b = 10;
			System.out.println("Before Swap: a = " + a + ", b = " + b);
			a = a + b; // a now becomes 15
			b = a - b; // b becomes 5 (15 - 10)
			a = a - b; // a becomes 10 (15 - 5)
			System.out.println("After Swap: a = " + a + ", b = " + b);

//Swap digits in a number
			int num = 12;
			System.out.println("Before swapping: num = " + num);
			// Extract digits
			int tens = num / 10; // Get the tens digit (1)
			int ones = num % 10; // Get the ones digit (2)
			// Swap digits without using a third variable
			num = ones * 10 + tens; // Construct swapped number
			
			System.out.println("After swapping: num = " + num);
	}
}

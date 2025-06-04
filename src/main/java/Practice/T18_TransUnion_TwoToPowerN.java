package Practice;

/**
 * write an optimized java code with O(1) complexity for below
 * you are given a positive integer n
 *     you need to return the value of 2^n (ie 2 to the power n) - not by using  Math.pow function
 */
public class T18_TransUnion_TwoToPowerN {
	public static long powerOfTwo(int n)
	{
		if (n < 0)
		{
			throw new IllegalArgumentException("n must be a non-negative integer.");
		}
		return 1L << n; // Left shift 1 by n places
	}
	
	public static void main(String[] args) {
		int n = 10; // Example input
		System.out.println("2^" + n + " = " + powerOfTwo(n));
	}
}

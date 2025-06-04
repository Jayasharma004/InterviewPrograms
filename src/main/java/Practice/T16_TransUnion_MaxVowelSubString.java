package Practice;

public class T16_TransUnion_MaxVowelSubString {
		
		public static void main(String[] args) {
			String str = "helloworld";
			int k = 3;
			String result = findMaxVowelSubstring(str, k);
			System.out.println("Substring with maximum vowels: " + result);
		}
		
		public static String findMaxVowelSubstring(String str, int k)
		{
			if (str == null || str.length() < k || k <= 0)
			{
				throw new IllegalArgumentException("Invalid input.");
			}
			int maxVowels = 0;
			int currentVowels = 0;
			int startIndex = 0;
			
			// Initialize the first window of size k
			for (int i = 0; i < k; i++)
			{
				if (isVowel(str.charAt(i)))
				{
					currentVowels++;
				}
			}
			maxVowels = currentVowels;
			
			// Slide the window across the string
			for (int i = k; i < str.length(); i++)
			{
				// Remove the outgoing character from the window
				if (isVowel(str.charAt(i - k)))
				{
					currentVowels--;
				}
				// Add the incoming character to the window
				if (isVowel(str.charAt(i)))
				{
					currentVowels++;
				}
				
				// Update max vowels and start index if the current window is better
				if (currentVowels > maxVowels)
				{
					maxVowels = currentVowels;
					startIndex = i - k + 1;
				}
			}
			
			// Return the substring with maximum vowels
			return str.substring(startIndex, startIndex + k);
		}
		
		// Helper function to check if a character is a vowel
		private static boolean isVowel(char c)
		{
			return "aeiouAEIOU".indexOf(c) != -1;
		}
	}
	

public class T13_SlidingWindow_MaxVowels {
	
	public String test(String str, int k)
	{
		int count = Integer.MAX_VALUE;
		int maxVowelCount = 0;
		String resultSubString = "";
		char[] charArr = str.toCharArray();
		for(int i=0; i<charArr.length; i=i+2)
		{
			if(str.charAt(i) == 'a')
			{
				count++;
			}
			if(str.charAt(i) == 'e')
			{
				count++;
			}
			if(str.charAt(i) == 'i')
			{
				count++;
			}
			if(str.charAt(i) == 'o')
			{
				count++;
			}
			if(str.charAt(i) == 'u')
			{
				count++;
			}
			resultSubString = resultSubString + str.charAt(i); //hel , ell
			maxVowelCount = Math.max(count, maxVowelCount);	//1, 1
		}
		return resultSubString;
	}
	
	public int maxVowels(String s, int k) {
		int n = s.length();
		int maxVowels = 0;
		int count = 0;
		
		int[] vowels = new int[128];
		vowels['a'] = 1;
		vowels['e'] = 1;
		vowels['i'] = 1;
		vowels['o'] = 1;
		vowels['u'] = 1;
		
		for (int i = 0; i < k; i++) {
			count += vowels[s.charAt(i)];
		}
		
		maxVowels = count;
		for (int i = k; i < n; i++)
		{
			count += vowels[s.charAt(i)] - vowels[s.charAt(i - k)];
			maxVowels = Math.max(maxVowels, count);
			if (maxVowels == k)
			{
				return maxVowels;
			}
		}
		return maxVowels;
	}
	
	public static void main(String[] args) {
		String str = "helloworld";
		int k=3;
		int result = new T13_SlidingWindow_MaxVowels().maxVowels(str,k);
		System.out.println("result : "+result);
	}
}

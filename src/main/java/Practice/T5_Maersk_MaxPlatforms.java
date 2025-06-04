package Practice;

//Maersk Interview
public class T5_Maersk_MaxPlatforms {


	public static int numberOfPlatforms(int[] arrivals,int[] departures )
	{
		int countPlatforms = 1;
			for(int i=1; i< arrivals.length; i++)
			{
				if ( (departures[i-1] > arrivals[i]) )
				{
					System.out.println("departures[i-1] : "+departures[i-1]);
					System.out.println("arrivals[i] : "+arrivals[i]);
					countPlatforms++;
				}
				i++;
			}
		return countPlatforms;
	}
	
	
	
	public static void main(String[] args) {
		int[] arrivals = {900, 940, 950, 1100, 1500, 1800};
		int[] departures = {910, 1200, 1120, 1130, 1900, 2000};
		int numberOfPlatforms = numberOfPlatforms(arrivals,departures);
		System.out.println("numberOfPlatforms : "+numberOfPlatforms);
	}
}

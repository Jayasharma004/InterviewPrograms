import java.util.*;

////Maersk Interview
public class T3_Maersk_NumberOfPlatforms {
	
	public void testMethod(int[] arr, int target)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		int []positions = new int[2];
		for(int i=0; i< arr.length; i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], i);
			}
			int number = target - arr[i];
			if(map.containsKey(number))
			{
				positions[0] = i;
				positions[1] = map.get(number);
			}
		}
		System.out.println("map : "+map);
		System.out.println("positions[0] : "+positions[0]);
		System.out.println("positions[1] : "+positions[1]);
		
		/*for(int i=0; i< arr.length; i++)
		{
			for(int key : map.keySet())
			{
				if(target - key == arr[i])
				{
					positions[0] = i;
					positions[1] = map.get(key);
				}
			}
		}
		System.out.println("positions[0] : "+positions[0]);
		System.out.println("positions[1] : "+positions[1]);*/
	}
	
	
	public static void main(String[] args) {
		int[] arr = {2,7,11,15};
		int target = 9;
		new T3_Maersk_NumberOfPlatforms().testMethod(arr, target);
	
	}
}

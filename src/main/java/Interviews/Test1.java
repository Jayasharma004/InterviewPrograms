package Interviews;

import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(101,"Rahul");
		map1.put(103,"Raj");
		map1.put(106,"Chinna");
		map1.put(105,"Rahim");
		
		Map<String, Double> map2 = new HashMap<>();
		map2.put("Chinna",50000.0);
		map2.put("Rahim",60000.0);
		map2.put("Raj",70000.0);
		map2.put("Rahul",20000.0);
		
		Map<Integer, Double> map3 = new HashMap<>();
		for(Map.Entry<Integer, String> entry1 : map1.entrySet())
		{
			String value1 = entry1.getValue();
			if(map2.containsKey(value1))
			{
				map3.put(entry1.getKey(),map2.get(value1));
			}
		}
		System.out.println("map3 : "+map3);
		List<Map.Entry<Integer, Double>> sortedEntries = new ArrayList<>(map3.entrySet());
		Collections.sort(sortedEntries, new Comparator<Map.Entry<Integer, Double>>() {
			@Override
			public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
				return o2.getValue().compareTo(o1.getValue()); // Descending order
			}
		});
		
		// Print the sorted map
		List<String> resultList = new ArrayList<>();
		System.out.println("Sorted Map:");
		for (Map.Entry<Integer, Double> entry : sortedEntries)
		{
			resultList.add(entry.getKey()+ "=" +entry.getValue());
			//System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		System.out.println("resultList : "+resultList);
	}
}

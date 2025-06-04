package Practice;

import java.util.*;
public class T14_Gracenote_MapsSorting {
	
		public static void main(String[] args) {
			// Initialize first map
			Map<Integer, String> map1 = new HashMap<>();
			map1.put(101, "Rahul");
			map1.put(103, "Raj");
			map1.put(106, "Chinna");
			map1.put(105, "Rahim");
			
			// Initialize second map
			Map<String, Double> map2 = new HashMap<>();
			map2.put("Chinna", 50000.0);
			map2.put("Rahim", 60000.0);
			map2.put("Raj", 70000.0);
			map2.put("Rahul", 20000.0);
			
			// Sort map2 by values in descending order
			List<Map.Entry<String, Double>> sortedEntries = new ArrayList<>(map2.entrySet());
			Collections.sort(sortedEntries, new Comparator<Map.Entry<String, Double>>() {
				@Override
				public int compare(Map.Entry<String, Double> e1, Map.Entry<String, Double> e2) {
					return e2.getValue().compareTo(e1.getValue()); // Descending order
				}
			});
			
			// Map keys from map1 based on the sorted order of map2
			List<String> result = new ArrayList<>();
			for (Map.Entry<String, Double> entry : sortedEntries)
			{
				for (Map.Entry<Integer, String> map1Entry : map1.entrySet())
				{
					if (map1Entry.getValue().equals(entry.getKey()))
					{
						result.add(map1Entry.getKey() + "," + entry.getValue());
						break;
					}
				}
			}
			
			// Print the output
			for (String res : result) {
				System.out.println(res);
			}
		}
	}
	


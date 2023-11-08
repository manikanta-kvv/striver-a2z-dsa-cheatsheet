package basic_hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HighestLowestFrequency {

	/* approach 1:
	 * finding the highest and lowest  frequency element in the given array using Map
	 */
	// time complexity: O(n)
	// space complexity: O(n)
	public static void findHighestLowest(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		
		//storing into hashMap
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				// fetching from hashMap
				map.put(arr[i], map.get(arr[i]) + 1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		
		//loop through hashMap to find highest and lowest
		int minElement = 0, minFrequency = arr.length; // minFreq would be n; to find min, we should declare it as highest value
		int maxElement = 0, maxFrequency = 0;
		for(Entry<Integer, Integer> m : map.entrySet()) {
			int val = m.getValue();
			int key = m.getKey();
			//if current val is greater than maxFrequency, update maxFrequency and maxElement
			if(val > maxFrequency) {
				maxFrequency = val;
				maxElement = key;
			}
			if(val < minFrequency) {
				minFrequency = val;
				minElement = key;
			}
		
		}
		System.out.println("The highest frequency element is: " + maxElement);
        System.out.println("The lowest frequency element is: " + minElement);
	}
	
	public static void main(String[] args) {
		int arr[] = {10, 5, 10, 15, 10, 5};
		findHighestLowest(arr);
	}

}

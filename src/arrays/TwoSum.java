package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* Examples:
 * Example 1:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
Result: YES (for 1st variant)
       [1, 3] (for 2nd variant)
Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.

Example 2:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 15
Result: NO (for 1st variant)
	[-1, -1] (for 2nd variant)
Explanation: There exist no such two numbers whose sum is equal to the target.
 */

public class TwoSum {
	
	/* approach 1: using hashMap
	 * for every element in array, check if target-arr[i] exists in hashMap,
	 * if hashMap do not have the target-arr[i] element, then add arr[i] element and its index i 
	 */
	// time complexity : O(N)
	// space complexity : O(N)
	public static void twoSum_ap1_var1(int[] arr, int target) {
		Map<Integer, Integer> hashMap = new HashMap<>();
		boolean isPresent = false;
		for(int i = 0; i < arr.length; i++) {
			if(hashMap.containsKey(target-arr[i])) {
				isPresent = true;
			}
			else {
				hashMap.put(arr[i], i);
			}
		}
		if(isPresent) System.out.println("YES");
		else System.out.println("NO");
		
	}
	// time complexity : O(N)
	// space complexity : O(N)
	public static int[] twoSum_ap1_var2(int[] arr, int target) {
		Map<Integer, Integer> hashMap = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			if(hashMap.containsKey(target-arr[i])) {
				return new int[] { hashMap.get(target-arr[i]), i};
			}
			else {
				hashMap.put(arr[i], i);
			}
		}
		return new int[] {-1, -1};
	}

	
	/* approach 2: using two pointer approach
	 * sort the given array, and take isPresent with boolean data type
	 * take two pointers left and right
	 * initialize left pointer to zero and right pointer to arr.length - 1;
	 * if arr[left] + arr[right] < target, then increment left pointer by 1
	 * if arr[left] + arr[right] > target, then increment right pointer by 1
	 * if arr[left] + arr[right] = target, then set isPresent to true and break the loop
	 */
	public static void twoSum_ap2_var1(int[] arr, int target) {
		int left = 0;
		int right = arr.length-1;
		boolean isPresent = false;
		Arrays.sort(arr);
		while(left < right) {
			if((arr[left] + arr[right]) < target) {
				left++;
			}
			if((arr[left] + arr[right] > target)) {
				right--;
			}
			if((arr[left] + arr[right]) == target) {
				isPresent = true;
				break;
			}
		}
		if(isPresent) System.out.println("YES");
		else System.out.println("NO");
	}
	
	public static int[] twoSum_ap2_var2(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
//		Arrays.sort(arr);
		while(left < right) {
			if((arr[left] + arr[right]) == target) {
				System.out.println("Left: " + left);
				System.out.println("Right: " + right);
				return new int[] {left, right};
				
			}
			else if((arr[left] + arr[right]) < target) {
				left++;
			}
			else {
				right--;
			}
			
		}
		return new int[] {-1, -1};
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 6, 5, 8, 11};
		int target = 14;
//		twoSum_ap1_var1(arr, target);
//		int[] res1 = twoSum_ap1_var2(arr, target);
//		System.out.println(Arrays.toString(res1));
//		twoSum_ap2_var1(arr, target);
		int[] res2 = twoSum_ap2_var2(arr, target);
		System.out.println(Arrays.toString(res2));

	}

}

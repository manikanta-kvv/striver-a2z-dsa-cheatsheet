package arrays;

import java.util.ArrayList;
import java.util.List;

/* Examples:
 * Example 1:
Input:
n = 5,m = 5.
arr1[] = {1,2,3,4,5}  
arr2[] = {2,3,4,4,5}
Output:
 {1,2,3,4,5}

Explanation: 
Common Elements in arr1 and arr2  are:  2,3,4,5
Distnict Elements in arr1 are : 1
Distnict Elemennts in arr2 are : No distinct elements.
Union of arr1 and arr2 is {1,2,3,4,5} 

Example 2:
Input:
n = 10,m = 7.
arr1[] = {1,2,3,4,5,6,7,8,9,10}
arr2[] = {2,3,4,4,5,11,12}
Output: {1,2,3,4,5,6,7,8,9,10,11,12}
Explanation: 
Common Elements in arr1 and arr2  are:  2,3,4,5
Distnict Elements in arr1 are : 1,6,7,8,9,10
Distnict Elemennts in arr2 are : 11,12
Union of arr1 and arr2 is {1,2,3,4,5,6,7,8,9,10,11,12} 
 */

public class UnionOfSortedArrays {

	/* approach 1: using two pointer approach
	 * 
	 */
	public static void union_ap1(int[] arr1, int[] arr2) {
		List<Integer> list = new ArrayList<>();
		int i = 0, j = 0;
		while(i < arr1.length && j < arr2.length) {
			if(i < arr1.length && !list.contains(arr1[i]) && arr1[i] < arr2[j]) {
				list.add(arr1[i]);
				i++;
			}
			if(!list.contains(arr1[i]) && arr1[i] == arr2[j]) {
				list.add(arr1[i]);
				i++;
			}
			if(i < arr1.length && !list.contains(arr2[j]) && arr1[i] > arr2[j]) {
				list.add(arr2[j]);
				j++;
			}
			else {				
				j++;
			}
		}
		while(i < arr1.length) {
			if(!list.contains(arr1[i])) {
				list.add(arr1[i]);
			}
			i++;
		}
		while(j < arr2.length) {
			if(!list.contains(arr2[j])) {
				list.add(arr2[j]);
			}
			j++;
		}
		System.out.println("Union of two sorted arrays: " + list);
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,2};
		int[] arr2 = {2,3,4,4,5,11,12};
		union_ap1(arr1, arr2);

	}

}

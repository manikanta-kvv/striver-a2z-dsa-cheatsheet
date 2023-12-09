package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Examples:
 * Example 1:

Input:
arr[] = {1,2,-4,-5}, N = 4
Output:
1 -4 2 -5

Explanation: 

Positive elements = 1,2
Negative elements = -4,-5
To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5.

Example 2:
Input:
arr[] = {1,2,-3,-1,-2,-3}, N = 6
Output:
1 -3 2 -1 3 -2
Explanation: 

Positive elements = 1,2,3
Negative elements = -3,-1,-2
To maintain relative ordering, 1 must occur before 2, and 2 must occur before 3.
Also, -3 should come before -1, and -1 should come before -2.
 */

public class RearrangeArrBySign {

	
	/* approach 1: Var1 > when arr contains equal number of positive and negative elements
	 * swapping the elements to its ith index if i == 0 
	 * swapping the elements to its (i+1)th index if i != 0
	 */
	// time complexity : O(N^2)
	// space complexity : O(1)
	public static void rearrangeArrBySign_ap1_var1(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			int j = i+1;
			//for negatives
			if(arr[i] < 0) {
				while(arr[j] < 0) j++;
				//swap until j == i
				while( i == 0 && j > i) {
					//swap j and j-1
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					j--;
				}
				
			}
			else if(arr[i] >= 0) {
				while(arr[j] >= 0) j++;
			}
			if(j < arr.length) {
				//swap until j > i+1
				while(j > i+1) {
					//swap j and j-1
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					j--;
				}
	
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	/* approach 2: Var1 > when arr contains equal number of positive and negative elements
	 * take an empty array(say ans array) of size n, where n is size of the given array
	 * looping through the given array, 
	 * and check if the current is positive, then add current value to the ans array based on positiveIndex and increment positiveIndex value by 2
	 * else, add current value to the ans array based on negativeIndex and increment negativeIndex value by 2
	 */
	// time complexity : O(N)
	// space complexity : O(N)
	public static void rearrangeArrBySign_ap2_var1(int[] arr) {
		
		int posIndex = 0;
		int negIndex = 1;
		int[] ans = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 0) {
				ans[posIndex] = arr[i];
				posIndex += 2;
			}
			else {
				ans[negIndex] = arr[i];
				negIndex += 2;
			}
		}
		System.out.println(Arrays.toString(ans));
	}
	
	/* approach 3: Var2 > when arr does not contains equal number of positive and negative elements
	 * loop through the given array, and store all the positive elements into one list and negative values into another list
	 * take an empty array(say ans array)
	 * if positive elements > negative elements, then put all the elements into ans array, from positive and negative list till (negativeList.size)th index
	 * which means, let's say negativeList size = 2, so 2 elements from positive list and 2 elements from negative list added to ans array
	 * then add the leftover elements of positive list into ans array from (negativeList.size() * 2) index 
	 * similarly for, if negative elements > positive elements
	 */
	// time complexity : O(2*N)
	// space complexity : O(N)
	public static void rearrangeArrBySign_ap3_var2(int[] arr) {
		List<Integer> posList = new ArrayList<>();
		List<Integer> negList = new ArrayList<>();
		int[] ans = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 0) {
				posList.add(arr[i]);
			}
			else {
				negList.add(arr[i]);
			}
		}
	
		// if positive elements > negative elements
		if(posList.size() > negList.size()) {
			for(int i = 0; i < negList.size(); i++) {
				ans[2*i] = posList.get(i);
				ans[2*i+1] = negList.get(i);
			}
			int index = negList.size() * 2;
			for(int j = negList.size(); j < posList.size(); j++) {
				ans[index] = posList.get(j);
				index++;
			}
		}
		// if negative elements > positive elements
		else {
			for(int i = 0; i < posList.size(); i++) {
				ans[2*i] = posList.get(i);
				ans[2*i+1] = negList.get(i);
			}
			int index = posList.size() * 2;
			for(int j = posList.size(); j < negList.size(); j++) {
				ans[index] = negList.get(j);
				index++;
			}
		}
		
		System.out.println(Arrays.toString(ans));
	}
	
	public static void main(String[] args) {
		int[] arr = {-3,-1,-2,3,1,2,-4,-5, -6};
		int[] arr1 = {3,-3,-1,-2, 1,2};
//		rearrangeArrBySign_ap1_var1(arr);
//		rearrangeArrBySign_ap2_var1(arr);
		rearrangeArrBySign_ap3_var2(arr);

	}

}

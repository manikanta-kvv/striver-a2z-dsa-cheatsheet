package basic_hashing;

import java.util.HashMap;
import java.util.Scanner;

public class SampleNumberHashing {

	/* approach 1:
	 * declare a new array of size [Max(Arr)+1], i.e., Max(Arr) = maximum value in the array
	 * loop throught the given array, and if we found value i, then newArray[i] += 1
	 * if we found 1, then newArrray[1] = newArray[1] + 1, which maintains the frequency of elements in an array
	 * later when fetching, newArray[1] gives count of 1 in the given array
	 * newArray[2] gives count of 2 in the given array and so on...
	 * 
	 * note: max array size for int type, we can give,
	 *  inside a function/method is 10^6
	 *  globally is 10^7
	 *  
	 *  max array size for boolean type, we can give,
	 *  inside a function/method is 10^7
	 *  globally is 10^8
	 */
	// time complexity:
	// space complexity:
	public static void hashing_ap1(int[] arr, int[] countOf) {
		
		//pre-computing
		int[] hashArray = new int[13]; //assume to take the size of hashArray as 13
		
		for(int i = 0; i < arr.length; i++) {
			hashArray[arr[i]] += 1;
		}
		
		//fetching
		for(int i = 0; i < countOf.length; i++) {
			int val = hashArray[countOf[i]];
			System.out.println(countOf[i] + " occurs " + val + " times");
		}
	}
	
	
	/* approach 2:
	 * instead of using hashArray with size 12/13 or n+1, we can use HashMap to keep track of all elements in array as key, value pairs
	 * element -> key; frequency of element -> value
	 */
	// time complexity: O(1) [avg, best case], O(n) [worst case]
	// space complexity: O(n)
	public static void hashing_ap2(int[] arr, int[] countOf) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
		}
		
		for(int i = 0; i < countOf.length; i++) {
			int val = hashMap.getOrDefault(countOf[i], 0);
			System.out.println(countOf[i] + " occurs " + val + " times");
		}
		
	}
	
	
	public static void main(String[] args) {

		// taking input array from user using Scanner class
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of the array: ");
//		int n = sc.nextInt();
//		int[] inputArr = new int[n];
//		System.out.println("Enter the values for the array: ");
//		for(int i = 0; i < n; i++) {
//			inputArr[i] = sc.nextInt();
//		}
//		
//		System.out.println("Enter the size of the countOf array:");
//		int m = sc.nextInt();
//		int[] countOf = new int[m];
//		System.out.println("Enter the values for the countOf array:");
//		for(int i = 0; i < m; i++) {
//			countOf[i] = sc.nextInt();
//		}
		
		int[] arr = {1,2,3,2,5,4,1,12};
		int[] countOfArr = {1,5,2,11};
//		hashing_ap1(inputArr, countOf);
		hashing_ap2(arr, countOfArr);
	}

}

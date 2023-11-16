package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSortings {

	//selection sort: select minimums and swap
	public static void selectionSort(int[] arr) {
		System.out.println("Selection sort:\nBefore:" + Arrays.toString(arr));
		for(int i = 0; i < arr.length; i++) {
			int indexOfMinimum = findMinimum(arr, i, arr.length-1);
			swap(arr, i, indexOfMinimum);
		}
		System.out.println("After:" + Arrays.toString(arr));
		
	}
	public static int findMinimum(int[] arr, int start, int end) {
		int min = arr[start];
		int minIndex = start; 
		for(int i = start; i <= end; i++) {
			if(arr[i] < min) {
				min = arr[i];
				minIndex = i;
			}
		}
		return minIndex;
	}	
	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	//bubble sort : push the maximum to the right side by adjacent swaps
	public static void bubbleSort(int[] arr) {
		System.out.println("Bubble sort:\nBefore:" + Arrays.toString(arr));
		for(int i = arr.length-1; i >= 1; i--) {
			for(int j = 0; j < i; j++) {
				
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}
				
			}
		}
		System.out.println("After:" + Arrays.toString(arr));
	}
	
	
	
	//insertion sort : push the element to its current order by swaping elements
	public static void insertionSort(int[] arr ) {
		System.out.println("Insertion sort:\nBefore:" + Arrays.toString(arr));
		for(int i = 0; i < arr.length; i++) {
			int j = i;
			while(j > 0 && arr[j-1] > arr[j]) {
				swap(arr, j, j-1);
				j--;
			}
			
		}
		System.out.println("After:" + Arrays.toString(arr));
	}
	
	
	
	//merge sort : divide and merge approach
	public static void mergeSort(int[] arr, int low, int mid, int high) {
		int left = low;
		int right = mid+1;
		List<Integer> temp = new ArrayList<>();
		while(left <= mid && right <= high) {
			while(left <= mid && arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			}
			while(right <= high && arr[left] > arr[right]) {
				temp.add(arr[right]);
				right++;
			}
		}
		while(left <= mid) {
			temp.add(arr[left]);
			left++;
		}
		while(right <= high) {
			temp.add(arr[right]);
			right++;
		}
		for(int i = low; i <= high; i++) {
			arr[i] = temp.get(i-low);
		}
	}
	
	public static void mergeDivide(int[] arr, int low, int high) {
		// base condition
		if(low >= high) return;
		
		int mid = (low + high)/2;
		
		//left array
		mergeDivide(arr, low, mid);
		//right array
		mergeDivide(arr, mid+1, high);
		
		//merge the both arrays
		mergeSort(arr, low, mid, high);
		
	}
	
	
	//recursive bubble sort
	public static void recursiveBubbleSort(int[] arr, int n ) {
		//base condition
		if(n <= 1) return;
		
		for(int j = 0; j < n; j++) {
			if(arr[j] > arr[j+1]) {
				
				swap(arr, j, j+1);
			}
		}
		recursiveBubbleSort(arr, n-1);
		
		
	}
	
	
	//recursive insertion sort
	public static void recursiveInsertionSort(int[] arr, int n ) {
		//base condition
		if(n == arr.length) return;
	
		int j = n;
		while(j > 0 && arr[j-1] > arr[j]) {
			swap(arr, j-1, j);
			j--;
		}
		recursiveInsertionSort(arr, n+1);
	}
	
	
	//quick sort : find pivot and place it at its current index position
	public static void quickSort(int[] arr, int low, int high ) {
		if(low < high) {			
			int indexPos = findPivotIndex(arr, low, high);
			quickSort(arr, low, indexPos-1);
			quickSort(arr, indexPos+1, high);
		}
		
	}
	
	public static int findPivotIndex(int[] arr, int low, int high ) {
		int pivot = arr[low];
		int left = low;
		int right = high;
		while(left < right) {
			while(left <= high && arr[left] <= pivot) {
				left++;
			}
			while(right >= low && arr[right] > pivot) {
				right--;
			}
			if(left < right) {
				swap(arr, left, right);
			}
		}
		swap(arr, low, right);
		return right;
	}
	
	
	
	//main method
	public static void main(String[] args) {
		int[] arr = {4,1,7,9,3};
		selectionSort(arr);
		bubbleSort(arr);
		insertionSort(arr);
		mergeDivide(arr, 0, arr.length-1);
		recursiveBubbleSort(arr, arr.length-1);
		recursiveInsertionSort(arr, 0);
		quickSort(arr, 0, arr.length-1);
		System.out.println("After:" + Arrays.toString(arr));

	}

}

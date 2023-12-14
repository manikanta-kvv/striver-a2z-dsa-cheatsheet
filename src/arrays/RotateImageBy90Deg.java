package arrays;

import java.util.ArrayList;
import java.util.Arrays;

/* Examples:
 * Example 1:

Input: [[1,2,3],[4,5,6],[7,8,9]]

Output: [[7,4,1],[8,5,2],[9,6,3]]

Explanation: Rotate the matrix simply by 90 degree clockwise and return the matrix.

Example 2:

Input: [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]

Output:[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

Explanation: Rotate the matrix simply by 90 degree clockwise and return the matrix
 */

public class RotateImageBy90Deg {
	
	
	/* approach 1: using extra matrix 
	 * 0th index row from matrix will be placed at (n-1)th index col
	 * we will start our process of adding values from the last column
	 * using (n-i-1) will start our pointer from last column 
	 * for examples, i = 0, n = 3, then (n-i-1) will be (3-0-1) = 2, this 2 will be the last column of our matrix
	 * i = 1, n = 3, then (n-i-1) will be (3-1-1) = 1, this 1 will be the 2nd last column of our matrix and so on...
	 * so every time i increases, our pointer will move from last column to first column
	 * and also j value will be incremented by the loop, giving us values from 0 to m-1, where m is no of columns
	 * thus, when n = 3, i = 0, j = 0, then arr[j][n-i-1] will be arr[0][3-0-1] = arr[0][2]
	 * thus, when n = 3, i = 0, j = 1, then arr[j][n-i-1] will be arr[1][3-0-1] = arr[1][2]
	 * thus, when n = 3, i = 0, j = 2, then arr[j][n-i-1] will be arr[2][3-0-1] = arr[2][2]
	 * thus, when n = 3, i = 1, j = 0, then arr[j][n-i-1] will be arr[0][3-1-1] = arr[0][1]
	 * thus, when n = 3, i = 1, j = 1, then arr[j][n-i-1] will be arr[1][3-1-1] = arr[1][1]
	 * thus, when n = 3, i = 1, j = 2, then arr[j][n-i-1] will be arr[2][3-1-1] = arr[2][1] and so on...
	 */
	//	Time Complexity: O(N^2)
	//	Space Complexity: O(N^2)
	public static void rotateBy90Deg_ap1(int[][] matrix) {
		int n = matrix.length; //rows
		int m = matrix[0].length; //cols
		int[][] dummyMatrix = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				int val = matrix[i][j];
				System.out.print(val);
				dummyMatrix[j][n-i-1] = val;
			}
			System.out.println();
		}
		for(int[] row : dummyMatrix) {
			System.out.println(Arrays.toString(row));
		}
	}
	
	
	/* approach 2: without using extra space for resultant matrix instead do inplace update
	 * transpose given matrix, which means swap the elements as follows:
	 * swap (0,1) and (1,0)
	 * swap (0,2) and (2,0)
	 * swap (1,2) and (2,1)
	 * while swapping, j pointer should start from i, 
	 * value at (0,1) was swapped with (1,0) when i at 0, so if j starts from 0, then (1,0) will again swap with (0, 1), which gives us different output
	 * that's why j should start from i
	 * after this, reverse the elements in every row, which gives us the required output
	 */
	//	Time Complexity: O(N^2) + O(N)
	//	Space Complexity: O(1)
	public static void rotateBy90Deg_ap2(int[][] matrix) {
		int n = matrix.length; //rows
		int m = matrix[0].length; //cols
		
		for(int i = 0; i < n; i++) {
			for(int j = i; j < m; j++) {
			
				// swap (i, j) wiht (j, i)
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		for(int[] row : matrix) {			
			//reverse the array
			reverseArray(row, 0, row.length-1);
		}
		
		for(int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
	}
	
	public static void reverseArray(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] matrix2 = { {5,1,9,11}, {2,4,8,10}, {13,3,6,7}, {15,14,12,16} };
		rotateBy90Deg_ap2(matrix2);

	}

}

package arrays;

import java.util.ArrayList;

/* Examples:
 * Example 1:
Input: Matrix[][] = { { 1, 2, 3, 4 },
		      { 5, 6, 7, 8 },
		      { 9, 10, 11, 12 },
	              { 13, 14, 15, 16 } }

Outhput: 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10.
Explanation: The output of matrix in spiral form.

Example 2:
Input: Matrix[][] = { { 1, 2, 3 },
	              { 4, 5, 6 },
		      { 7, 8, 9 } }
			    
Output: 1, 2, 3, 6, 9, 8, 7, 4, 5.
Explanation: The output of matrix in spiral form.
 */

public class SpiralTraversalOfMatrix {
	
	/* approach 1:
	 * use four loops to add elements from matrix to a list in spiral order
	 * one for left to right -> which is used to print top row from left to right
	 * one for top to bottom -> which is used to print right column from top to bottom
	 * one for right to left -> which is used to print bottom row from right to left
	 * one for bottom to top -> which is used to print left column from bottom to top
	 * these loops run till left <= right and top <= bottom
	 */
	//	Time Complexity: O(m x n)
	//	Space Complexity: O(n) 
	public static void spiralTraversalMatrix(int[][] matrix) {
		int n = matrix.length; //rows
		int m = matrix[0].length; //cols
		int left = 0;
		int right = m-1;
		int top = 0;
		int bottom = n-1;
		ArrayList<Integer> spiralList = new ArrayList<>();
		
		while(left <= right && top <= bottom) {
			
			//one loop from left to right
			for(int i = left; i <=right; i++) {
				spiralList.add(matrix[top][i]);
			}
			top++;
			//one loop from top to bottom
			for(int i = top; i <=bottom; i++) {
				spiralList.add(matrix[i][right]);
			}
			right--;
			if(top <= bottom) {				
				//one loop from right to left
				for(int i = right; i >= left; i--) {
					spiralList.add(matrix[bottom][i]);
				}
				bottom--;
			}
			if(left <= right) {
				
				//one loop from bottom to top
				for(int i = bottom; i >= top; i--) {
					spiralList.add(matrix[i][left]);
				}
				left++;
			}
		}
		
		
		
		System.out.println(spiralList);
		
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 },
			      { 5, 6, 7, 8 },
			      { 9, 10, 11, 12 },
		              { 13, 14, 15, 16 } };
		spiralTraversalMatrix(matrix);

	}

}

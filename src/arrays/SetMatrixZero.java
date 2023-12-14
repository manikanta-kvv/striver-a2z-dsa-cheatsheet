package arrays;

import java.util.ArrayList;
import java.util.Arrays;


/* Examples:
 * Examples 1:

Input: matrix=[[1,1,1],[1,0,1],[1,1,1]]

Output: [[1,0,1],[0,0,0],[1,0,1]]

Explanation: Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.
 
Input: matrix=[[0,1,2,0],[3,4,5,2],[1,3,1,5]]

Output:[[0,0,0,0],[0,4,5,0],[0,3,1,0]]

Explanation:Since matrix[0][0]=0 and matrix[0][3]=0. Therefore 1st row, 1st column and 4th column will be set to 0
 */

public class SetMatrixZero {
	
	/* approach 1:
	 * using two loops
	 * we will keep track of visited rows and cols having zero, and store those visited rows and cols with value 1 in two arrays namely colArr, rowArr
	 * colArr[2] == 1 means 2nd index col visited and it has zero in its column, so we have to make entire 2nd index col as zero
	 * rowArr[1] == 1 means 1st index row visited and it has zero in its row, so we have to make entire 1st index row as zero
	 * whenever a rowArr[i] or colArr[j] is equal to 1, which means we have to mark the entire row & col to zero
	 * after that, again loop through the array and check if at any point rowArr[i] == 1 or colArr[j] == 1, set value to 0 at (i, j)
	 */
	//	Time Complexity: O(2*(N*M))
	//	Space Complexity: O(N) + O(M)
	public static void setMatrixZero_ap1(ArrayList<ArrayList<Integer>> matrix) {
		int n = matrix.size(); //rows
		int m = matrix.get(0).size(); //cols
		int[] rowArr = new int[n];
		int[] colArr = new int[m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(matrix.get(i).get(j) == 0) {
					rowArr[i] = 1;
					colArr[j] = 1;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(rowArr[i] == 1 || colArr[j] == 1) {
					matrix.get(i).set(j, 0);
				}
			}
		}
		
		
		System.out.println(matrix);
	}
	
	
	/* approach 2:
	 * using two loops and without using two extra arrays for rows, cols
	 * in this approach instead of using two separate arrays like rowArr and colArr for marking, 
	 * we will use the rows[0] i.e., 0th index row as marking for colArr and cols[0] i.e., 0th index col as marking for rowArr
	 * so the problem here is, while taking like this, row[0][0] coincides with col[0][0], inorder to resolve this, we will store the col[0][0] value in col0 variable
	 * so, rowArr will contains the markings from 0 to n-1
	 * colArr will contains the marking from 1 to n-1 and col0 variable contains the col[0][0] value
	 * after that, loop through every element of matrix and check if there's zero present, then mark 0th index row and 0th index col based on i and j values
	 * if at any point, j != 0 and the element at (i,j) == 0, then set j value to 0 at 0th index else set col0 to 0
	 * now, without disturbing the 0th index row and 0th index col, as they are used for marking, loop through the array from (1,1) till end
	 * if at any point (i, j) value have the marking to be zero, means ith index row or jth index col contains the zero in the marking arrays, then set (i,j) to 0
	 * if we set the col0 to zero at first place, then there's chance that 0th index row values might also get effected and changed to zero, giving us a different output
	 * so inorder to tackle this, we will first check if row[0][0] is zero, if yes, change the 0th index values to zeroes as accordingly
	 * after this, check for col0 value, if col0 == 0, change the 0th index col values to zeroes as accordingly
	 */
	//	Time Complexity: O(2*(N*M))
	//	Space Complexity: O(1)
	public static void setMatrixZero_ap2(ArrayList<ArrayList<Integer>> matrix) {
		int n = matrix.size(); //rows
		int m = matrix.get(0).size(); //cols
		
		int col_0 = matrix.get(0).get(0);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(matrix.get(i).get(j) == 0) {
					matrix.get(i).set(0, 0);
					if(j != 0) {
						matrix.get(0).set(j, 0);
					}
					else {
						col_0 = 0;
					}
				}
			}
		}
		
		for(int i = 1; i < n; i++) {
			for(int j = 1; j < m; j++) {
				if(matrix.get(i).get(j) != 0) {				
					if(matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
						matrix.get(i).set(j, 0);
					}
				}
			}
		}
		
		if(matrix.get(0).get(0) == 0) {
			for(int j = 0; j < m; j++) {
				matrix.get(0).set(j, 0);
			}
		}
		
		if(col_0 == 0) {
			for(int i = 0; i < n; i++) {
				matrix.get(i).set(0, 0);
			}
		}
		
		System.out.println(matrix);
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
	    matrix.add(new ArrayList<>(Arrays.asList(0,0,1)));
	    matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
        setMatrixZero_ap1(matrix);
        setMatrixZero_ap2(matrix);
	}

}

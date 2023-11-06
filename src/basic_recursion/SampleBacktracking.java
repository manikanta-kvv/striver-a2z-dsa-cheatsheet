package basic_recursion;

public class SampleBacktracking {

	/*
	 * backtracking is also know as backward recursion
	 * in this backtracking approach, instead of going from 1 to n, we run loop from n to 1 maintaining the base condiion
	 */
	// print 1 to n
	// time complexity: O(n)
	// space complexity: O(n)
	public static void backtracking(int i, int n) {
		
		//base condition
		if(i < 1) return;
		backtracking(i-1, n);
		System.out.println(i);
	}
	
	//print n to 1
	// time complexity: O(n)
	// space complexity: O(n)
	public static void backtrack(int i, int n) {
		if(i > n) return;
		backtrack(i+1, n);
		System.out.println(i);
	}
	
	//main method
	public static void main(String[] args) {
		backtracking(5, 5);
		backtrack(1, 5);
	}
}

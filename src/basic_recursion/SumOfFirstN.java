package basic_recursion;

/* Examples:
 * Example 1:
Input: N=5
Output: 15
Explanation: 1+2+3+4+5=15

 * Example 2:
Input: N=6
Output: 21
Explanation: 1+2+3+4+5+6=15
 */

public class SumOfFirstN {
	
	/* approach 1:  working of recursion, for n = 5
	 *  5 + (4 + (3 + (2 + (1 + 0))))
	 *  5 + (4 + (3 + (2 + 1)))
	 *  5 + (4 + (3 + 3))
	 *  5 + (4 + 6)
	 *  5 + 10
	 *  15
	 */
	// time complexity: O(n)
	// space complexity: O(n)
	public static int sum_ap1(int n) {
		if(n < 1) return 0;
		int sum = n + sum_ap1(n-1);
		return sum;
	}
	
	/* approach 2: using formula N(N+1)/2
	 * 
	 */
	// time complexity: O(1)
	// space complexity: O(1)
	public static int sum_ap2(int n) {
		int sum = (n * (n+1)) / 2;
		return sum;
	}

	//main method
	public static void main(String[] args) {
		int n = 6;
		int res = sum_ap2(n);
		System.out.println("Sum of first " + n + " natural numbers is: " + res);
		
		
	}

}

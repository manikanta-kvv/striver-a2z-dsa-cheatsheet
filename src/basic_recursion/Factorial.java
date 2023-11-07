package basic_recursion;

/* Examples:
 * Example 1:
Input: X = 5
Output: 120
Explanation: 5! = 5*4*3*2*1

 * Example 2:
Input: X = 3
Output: 6
Explanation: 3!=3*2*1
 */

public class Factorial {

	/* approach 1: 
	 * just like sum of first N program, instead of adding, we can multiply the values to get the factorial of a number
	 */
	// time complexity: O(n)
	// space complexity: O(n)
	public static int factorial_ap1(int n ) {
		
		//base condition
		if(n == 0) return 1;
		int product = n * factorial_ap1(n-1);
		return product;
	}
	
	
	public static void main(String[] args) {
		int n = 5;
		int res = factorial_ap1(n);
		System.out.println("Factorial of " + n + " is: " + res);
	}

}

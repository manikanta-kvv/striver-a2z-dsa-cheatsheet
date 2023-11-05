package basic_maths;

/* Examples:
 
 * Example 1:
Input: num1 = 4, num2 = 8
Output: 4
Explanation: Since 4 is the greatest number which divides both num1 and num2.

 * Example 2:
Input: num1 = 3, num2 = 6
Output: 3
Explanation: Since 3 is the greatest number which divides both num1 and num2.
 */

public class FindGCD {

	/* approach 1:
	 * brute force: loop from 1 to min(num1, num2) and for every i in loop, if num1%i == 0 and num2%i == 0, store it in variable as ans
	 */
	// time complexity: O(n)
	// space complexity: O(1)
	public static void gcd_ap1(int num1, int num2) {
		
		int ans = 0;
		for(int i = 1; i <= Math.min(num1, num2); i++) {
			
			if(num1 % i == 0 && num2 % i == 0) {
				
				ans = i;
			}
		}
		System.out.println("GCD of " + num1 + " and " + num2 + " using bruteforce approach is: " + ans);
	}
	
	
	/* approach 2:
	 * optimal solution: call gcd(b, a%b) while b==0 as base condition, if it meets base condition return a
	 */
	// time complexity: O(log min(a,b))
	// space complexity: O(1)
	private static int gcd_ap2(int a, int b) {
		
		if(b == 0) return a;
		return gcd_ap2(b, a%b);
	}
	
	
	//main method
	public static void main(String[] args) {
		int num1 = 132;
		int num2 = 36;
		gcd_ap1(num1, num2);
		
		int res = gcd_ap2(num1, num2);
		System.out.println("GCD of " + num1 + " and " + num2 + " using optimal solution is: " + res);
	}
}

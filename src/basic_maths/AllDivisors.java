package basic_maths;

import java.util.ArrayList;
import java.util.List;

/* Examples:
 * Example 1:
Input: n = 36
Output: 1 2 3 4 6 9 12 18 36
Explanation: All the divisors of 36 are printed.

 * Example 2:
Input: n = 97
Output: 1 97
Explanation: Since 97 is a prime number, only 1 and 97 are printed.
 */

public class AllDivisors {

	/* approach 1: bruteforce approach
	 * loop from 1 to n, and check for every i, if num % i == 0
	 */
	// time complexity: O(n)
	// space complexity: O(1)
	public static void findAllDivisors_ap1(int num) {
		

		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	
	/* approach 2: optimal solution
	 * half of the divisors are the quotients of remaining divisiors
	 * so we can run loop to sqroot of num, which runs loop for the first part
	 */
	// time complexity: O(sqrt(num))
	// space complexity: O(1)
	public static void findAllDivisors_ap2(int num) {
		
		for(int i = 1; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
				if(i != num/i) System.out.print(num/i + " ");
			}
		}
	}
	
	
	
	
	//main method
	public static void main(String[] args) {
		int num = 36;
		findAllDivisors_ap1(num);
		findAllDivisors_ap2(num);
		
	}

}

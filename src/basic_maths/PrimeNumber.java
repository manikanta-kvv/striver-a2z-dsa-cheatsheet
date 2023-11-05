package basic_maths;

/* Examples:
 * Example 1:
Input: N = 3
Output: Prime
Explanation: 3 is a prime number

 * Example 2:
Input: N = 26
Output: Non-Prime
Explanation: 26 is not prime
 */

public class PrimeNumber {

	/* approach 1:
	 * bruteforce approach: loop from 2 to num, find if a num % i == 0, then it is not prime
	 */
	// time complexity: O(n)
	// space complexity: O(1)
	public static boolean checkPrime_ap1(int num) {
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
	
	
	/* approach 2:
	 * optimal solution: loop from 2 to sqroot of num, find if a num % i == 0, then it is not prime
	 */
	// time complexity: O(sqroot(n))
	// space complexity: O(1)
	public static boolean checkPrime_ap2(int num) {
		
		if(num < 2) return false;
		
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
	
	// main method
	public static void main(String[] args) {
		int num = 2;
		boolean res = checkPrime_ap2(num);
		if(res) System.out.println("Prime number");
		else System.out.println("Not a Prime number");

	}

}

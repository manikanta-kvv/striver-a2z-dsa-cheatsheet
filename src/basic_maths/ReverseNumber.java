package basic_maths;

/* Examples:
 * Example 1:
Input: N = 123
Output: 321
Explanation: The reverse of 123 is 321

 * Example 2:
Input: N = 234
Output: 432
Explanation: The reverse of 234 is 432
 
 
 */

public class ReverseNumber {

	/*approach 1:
	 	* loop till the given number is not equal to zero
	 	* using modulo (%) operator collect the remainder and add to the value
	 	* initiate value to zero  and for every remainder, multiply the number generated so far by 10, and add the remainder to it.
	 */
	// time complexity: O(log n)
	// space complexity: O(1) 
	public static int reverse(int num) {
		
		int val = 0;
		while(num > 0) {
			val = val*10 + num % 10;
			num = num / 10;
		}

		return val;
		
	}
	
	
	// main method
	public static void main(String[] args) {
		int res = reverse(1089);
		System.out.println("Reverse number: " + res);
	}
}

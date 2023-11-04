package basic_maths;

/* Examples:
 
 * Example 1:
Input: N = 12345
Output: 5
Explanation: N has 5 digits

 * Example 2:
Input: N = 8394
Output: 4
Explanation: N has 4 digits
 
 
 */

public class CountDigits {

	/*approach 1: 
	 	* loop till the given number is not equal to zero using modulo (%) operator and increment the count
	*/
	// time complexity: O(n)
	// space complexity: O(1)
	public static int countDigits_ap1(int num) {
		
		int count = 0;
		while(num > 0) {
			
			num = num / 10;
			count++;
		}
		return count;
	}
	
	
	/*approach 2: 
	    * convert integer to string and find length of the string 
	*/
	// time complexity: O(1)
	// space complexity: O(1)
	public static int countDigits_ap2(int num) {
		int len = Integer.toString(num).length();
		return len;
		
	}
	
	
	/*approach 3: 
		* to count number of digits, use logarithm base 10, log10(12345) = 4.091, 
		* take integral part of it i.e., 4 and add 1 to it, which results 4 + 1 = 5 (number of digits)
	*/
	// time complexity: O(1)
	// space complexity: O(1)
	private static int countDigits_ap3(int num) {
		int res = (int) Math.floor(Math.log10(num) + 1);
		return res;
	}
	
	
	// main method
	public static void main(String[] args) {
		int res1 = countDigits_ap1(87593);
		int res2 = countDigits_ap2(8759);
		int res3 = countDigits_ap3(8752349);
		System.out.println(res3);
	}
}

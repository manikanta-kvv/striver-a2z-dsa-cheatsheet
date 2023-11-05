package basic_maths;

/* Examples:
 * Example 1:
Input: N = 123
Output: Not Palindrome Number
Explanation: 123 read backwards is 321.Since these are two different numbers 123 is not a palindrome.

 * Example 2:
Input: N =  121 
Output: Palindrome Number
Explanation: 121 read backwards as 121.Since these are two same numbers 121 is a palindrome.
 */

public class PalindromeNumber {

	/*approach 1:
	 * do reversal of a number and check if the reversal is equal to given number
	 */
	// time complexity: O(log n)
	// space complexity: O(1)
	public static boolean checkPalindrome(int num) {
		
		int temp = num;
		int reversalNumber = 0;
		
		while(num > 0) {
			reversalNumber = reversalNumber * 10 +  num % 10;
			num = num / 10;
		}
		if(temp == reversalNumber) return true;
		return false;
	}
	
	//main method
	public static void main(String[] args) {
		boolean res = checkPalindrome(121);
		if(res) System.out.println("Palindrome number");
		else System.out.println("Not a Palindrome number");
	}
}

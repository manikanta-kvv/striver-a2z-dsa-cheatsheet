package basic_recursion;

/* Examples:
 * Example 1:
Input: Str =  “ABCDCBA”
Output: Palindrome
Explanation: String when reversed is the same as string.

 * Example 2:
Input: Str = “TAKE U FORWARD”
Output: Not Palindrome
Explanation: String when reversed is not the same as string.
 */

public class PalindromeString {

	/* approach 1:
	 * loop till half of the length of the string, and check characters at starting and ending index positions
	 * for each iteration start index will be start + 1, end index will be end - 1 
	 */
	// time complexity: O(n)
	// space complexity: O(1)
	public static boolean checkPalindromeString_ap1(String word) {
		
		int start = 0;
		int end = word.length() - 1;
		for(int i = 0; i < word.length()/2; i++) {
			if(word.charAt(start) != word.charAt(end)) return false;
			start++;
			end--;
		}
		return true;
		
	}
	
	
	/* approach 2:
	 * using recursion method: loop till half of the length of the string, this will be the base condition for recursion function
	 * for each iteration start index will be start + 1, end index will be end - 1, then call recursive function
	 * check if at any iteration, start and end index characters are not same, return false
	 * else if characters are same, call recursive function until base condition satisfied and return true
	 */
	// time complexity: O(n/2)
	// space complexity: O(1)
	public static boolean checkPalindromeString_ap2(String word, int start) {
		
		//base condition
		if(start >= word.length()/2) return true;
		
		if(word.charAt(start) != word.charAt(word.length()-1-start)) return false;
		return checkPalindromeString_ap2(word, start+1);
		
	}
	
	
	// main method
	public static void main(String[] args) {
		String word = "ABCDCBA";
		boolean val = checkPalindromeString_ap1(word);
		boolean val2 = checkPalindromeString_ap2(word, 0);
		if(val2) System.out.println("Palindrome String");
		else System.out.println("Not a Palindrome String");

	}

}

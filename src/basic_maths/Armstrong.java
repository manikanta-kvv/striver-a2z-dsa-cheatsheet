package basic_maths;

/* Examples:
 * Example 1:
Input:153 
Output: Yes, it is an Armstrong Number
Explanation: 1^3 + 5^3 + 3^3 = 153

 * Example 2:
Input:170 
Output: No, it is not an Armstrong Number
Explanation: 1^3 + 7^3 + 0^3 != 170
 */

public class Armstrong {
	
	/* approach 1:
	 * find the length of the number, for every digit in the number, do digit ^ len(num)
	 */
	// time complexity: O(log n)
	// space complexity: O(1)
	public static boolean checkArmstrong_ap1(int num) {
		int temp = num;
		int val = 0;
		int len = (int) Math.floor(Math.log10(num) + 1);
		while(num > 0) {
			val += (int)Math.pow(num % 10, len);
			num = num / 10;
		}
		if(temp == val) return true;
		return false;
	}
	
	//main method
	public static void main(String[] args) {
		int num = 1634;
		boolean res = checkArmstrong_ap1(num);
		if(res) System.out.println("Yes, it is Armstrong number");
		else System.out.println("No, it is not a Armstrong number");
	}
}

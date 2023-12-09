package arrays;

/* Examples:
 * Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and 
sell on day 5 (price = 6), profit = 6-1 = 5.

Note: That buying on day 2 and selling on day 1 
is not allowed because you must buy before 
you sell.

Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are 
done and the max profit = 0.
 */

public class StockBuyAndSell {

	/* approach 1:
	 * using two loops
	 * from current element to its right side elements, if there exists a value > current element
	 * then, set currentProfit = arr[j] - arr[i]
	 * and if currentProfit > maxProfit, set maxProfit = currentProfit
	 */
	// time complexity : O(N^2)
	// space complexity : O(1)
	public static void stockBuySell_ap1(int[] arr) {
		int currentProfit = 0;
		int maxProfit = 0;
		for(int i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i] + " : [");
			for(int j = i+1; j < arr.length; j++) {
				System.out.print(arr[j] + " ");
				if(arr[j] > arr[i]) {
					currentProfit = arr[j] - arr[i];
					if(currentProfit > maxProfit) {
						maxProfit = currentProfit;
					}
				}
			}
			System.out.print("]\n");
		}
		
		System.out.println("Max Profit: " + maxProfit);
	}
	
	
	/* approach 2:
	 * loop through the array, check if the currentValue < min so far, if so, change min to current value, i.e., min = arr[i]
	 * and check if currentProfit > maxProfit, if so, set maxProfit = currentProfit
	 */
	// time complexity : O(N)
	// space complexity : O(1)
	public static void stockBuySell_ap2(int[] arr) {
		int minVal = Integer.MAX_VALUE;
		int maxProfit = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < minVal) {
				minVal = arr[i];
			}
			int currentProfit = arr[i] - minVal;
			if(currentProfit > maxProfit) {
				maxProfit = currentProfit;
			}
 		}
		System.out.println("Max Profit: " + maxProfit);
	}
	
	
	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		stockBuySell_ap1(arr);
		stockBuySell_ap2(arr);

	}

}

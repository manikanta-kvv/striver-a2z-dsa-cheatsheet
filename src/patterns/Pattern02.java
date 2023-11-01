package patterns;

/* 
 * pattern to print:

* 
* * 
* * *

*/

public class Pattern02 {
	
	//right-angled triangle pattern
	public void pattern(int n, String symbol) {
		
		System.out.println("right-angled triangle pattern:");
		//outer loop for rows
		for(int i = 0; i < n; i++) {
			
			//inner loop for columns
			for(int j = 0; j <= i; j++) {
				
				System.out.print(symbol);
			}
			
			System.out.println();
		}
		
	}
}

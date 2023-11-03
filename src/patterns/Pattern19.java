package patterns;

/* 
 * pattern to print:

************
*****  *****
****    ****
***      ***
**        **
*          *
*          *
**        **
***      ***
****    ****
*****  *****
************

*/

public class Pattern19 {

	//symmetric-void pattern
	public void pattern(int n) {
		
		System.out.println("symmetric-void pattern:");
		//outer loop for rows
		for(int i = 0; i < n; i++) {
			
			//inner loop for columns
			
			//printing stars at start
			for(int j = 0; j < n - i; j++) {
				
				System.out.print("*");
			}
			
			//printing spaces at middle
			for(int j = 0; j < 2*i; j++) {
				
				System.out.print(" ");
			}
			
			//printing stars at end
			for(int j = 0; j < n - i; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i = 1; i <= n; i++) {
			
			//printing starts at start
			for(int j = 1; j <= i; j++) {
				
				System.out.print("*");
			}
			
			//printing spaces at middle
			for(int j = 0; j < 2*n - 2*i; j++) {
				
				System.out.print(" ");
			}
			//printing starts at end
			for(int j = 1; j <= i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

package patterns;

/* 
 * pattern to print:

*          *
**        **
***      ***
****    ****
*****  *****
************
*****  *****
****    ****
***      ***
**        **
*          *

*/

public class Pattern20 {

	//symmetric-butterfly pattern
	public void pattern(int n) {
		
		System.out.println("symmetric-butterfly pattern:");
		
		//outer loop for rows
		for(int i = 1; i <= n; i++) {
			
			//inner loop for columns
			
			//for printing stars at start
			for(int j = 0; j < i; j++) {
				
				System.out.print("*");
			}
			
			//for printing spaces at middle
			for(int j = 0; j < 2*n - 2*i; j++) {
				
				System.out.print(" ");
			}
			
			//for printing stars at end
			for(int j = 0; j < i; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i = 1; i < n; i++) {
			
			//for printing stars at start
			for(int j = 0; j < n - i; j++) {
				
				System.out.print("*");
			}
			
			//for printing spaces at middle
			for(int j = 0; j < 2*i; j++) {
				
				System.out.print(" ");
			}
			
			//for printing stars at end
			for(int j = 0; j < n - i; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}

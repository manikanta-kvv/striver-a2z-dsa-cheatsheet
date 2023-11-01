package patterns;

/* 
 * pattern to print:

***********
 *********
  *******
   ***** 
    ***    
     *

*/

public class Pattern08 {
	
	//inverted star pyramid pattern
	public void pattern(int n, String symbol) {
		
		System.out.println("inverted star pyramid pattern:");
		
		//outer loop for rows
		for(int i = 0; i < n; i++) {
			
			//inner loop for columns
			
			//for printing spaces at start
			for(int j =0; j < i; j++) {
				System.out.print(" ");
			}
			
			//for printing *'s at middle
			for(int j = 0; j < 2*n - (2*i+1); j++) {
				System.out.print("*");
			}
			
			//for printing spaces at end 
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

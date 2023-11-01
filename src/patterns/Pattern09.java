package patterns;

/* 
 * pattern to print:

     *
    ***
   ***** 
  *******
 *********
***********  
***********
 *********
  *******
   ***** 
    ***    
     *

*/


public class Pattern09 {

	//diamond star pattern
	public void pattern(int n, String symbol) {
		
		System.out.println("diamond star pattern:");
		
		//outer loop for rows
		for(int i =0; i< n; i++) {
			
			//inner loop for columns
			
			// *for printing top pattern
			//for printing spaces at start
			for(int j = 0; j < n-i-1; j++) {
				System.out.print(" ");
			}
			
			//for printing *'s at middle
			for(int j = 0; j < 2*i+1; j++) {
				System.out.print(symbol);
			}
			
			//for printing spaces at end
			for(int j = 0; j < n-i-1; j++) {
				System.out.print(" ");
			}
			
			System.out.println();
			
			
		}
		
	
		for(int i =0; i< n; i++) {
			
			// *for printing bottom pattern
			//for printing spaces at start
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			//for printing *'s at middle
			for(int j = 0; j < 2*n - (2*i+1); j++) {
				System.out.print(symbol);
			}
			
			//for printing spaces at end
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

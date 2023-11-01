package patterns;

/* 
 * pattern to print:

     *     
    ***    
   *****   
  *******  
 ********* 
***********
*/

public class Pattern07 {

	//star pyramid pattern
	public void pattern(int n, String symbol) {
		
		System.out.println("star pyramid pattern:");
		
		//outer loop for rows
		for(int i = 0; i < n; i++) {
			
			//inner loop for columns
			
			//for printing 4 spaces at the beginning 
			for(int j = 0; j < n-i-1; j++) {
				System.out.print(" ");
			}
			
			//for printing *'s at the middle
			for(int j = 0; j < 2*i+1; j++) {
				System.out.print(symbol);
			}
			
			//for printing 4 spaces at the end 
			for(int j = 0; j < n-i-1; j++) {
				System.out.print(" ");
			}
			System.out.println();

		}
	}
}

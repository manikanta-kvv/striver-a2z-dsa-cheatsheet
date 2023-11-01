package patterns;

/* 
 * pattern to print:

     *
     **
     *** 
     ****
     *****
     ******  
     *****
     ****
     ***    
     **
     *

*/

public class Pattern10 {

	//half diamond star pattern
	public void pattern(int n, String symbol) {
		
		System.out.println("half diamond star pattern:");
		
		//outer loop for rows
		for(int i = 1; i < 2*n -1 ; i++) {
			
			int stars = i;
			
			if(stars > n) stars = 2*n - i;
			
			//inner loop for columns
			for(int j=1; j <= stars; j++) {
				System.out.print(symbol);
			}
			
			
			System.out.println();
		}
		
		
		
	}
}

package patterns;

/* 
 * pattern to print:

###
###
###

*/

public class Pattern01 {
	
	//rectangular star pattern
	public void pattern(int n, String symbol) {
		
		System.out.println("rectangular star pattern:");
		//outer loop for rows
		for(int i = 0; i < n; i++) {
			
			//inner loop for columns 
			for(int j = 0; j < n; j++) {
				System.out.print(symbol);
			}
			System.out.println();
		}
	}
}

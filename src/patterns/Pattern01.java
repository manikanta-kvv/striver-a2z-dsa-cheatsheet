package patterns;

/* 
 * pattern to print:

###
###
###

*/

public class Pattern01 {
	
	public void pattern(int number, String symbol) {
		
		//outer loop for rows
		for(int i = 0; i < number; i++) {
			
			//inner loop for columns 
			for(int j = 0; j < number; j++) {
				System.out.print(symbol);
			}
			System.out.println();
		}
	}
}

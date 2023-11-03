package patterns;

/* 
 * pattern to print:

******
*    *
*    *
*    *
*    *
******

*/

public class Pattern21 {

	//hollow rectangle pattern
	public void pattern(int n) {
		
		System.out.println("hollow rectangle pattern:");
		
		//outer loop for rows
		for(int i = 0; i < n; i++) {
			
			//inner loop for columns
			for(int j = 0; j < n; j++) {
				
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

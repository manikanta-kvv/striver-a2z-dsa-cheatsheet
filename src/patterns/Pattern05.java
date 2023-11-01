package patterns;

/* 
 * pattern to print:

* * * * * *
* * * * * 
* * * * 
* * * 
* * 
* 

*/

public class Pattern05 {

	//inverted right pyramid pattern
	public void pattern(int n, String symbol) {
		
		System.out.println("inverted right pyramid pattern:");
		
		//outer loop for rows
		for(int i = 0; i < n; i++) {
			
			//inner loop for columns
			for(int j = n; j > i; j--) {
				
				System.out.print(symbol);
			}
			System.out.println();
		}
		
	}
}

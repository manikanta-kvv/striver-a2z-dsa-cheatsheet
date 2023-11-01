package patterns;

/* 
 * pattern to print:

1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2 
1

*/

public class Pattern06 {

	//inverted numbered right pyramid pattern
	public void pattern(int n) {
		
		System.out.println("inverted numbered right pyramid pattern:");
		
		//outer loop for rows
		for(int i = n; i > 0; i--) {
			
			//inner loop for columns
			for(int j = 1; j <= i; j++) {
				
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
}

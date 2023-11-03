package patterns;

/* 
 * pattern to print:

A B C D E F
A B C D E 
A B C D
A B C
A B
A

*/

public class Pattern15 {

	//reverse letter triangle pattern
	public void pattern(int n) {
		
		System.out.println("reverse letter triangle pattern:");
		
		//outer loop for rows
		for(int i = n; i > 0; i--) {
			
			//inner loop for columns
			for(char ch = 'A'; ch < 'A' + i; ch++) {
				
				System.out.print(ch + " ");
			}
			
			System.out.println();
		}
	}
}

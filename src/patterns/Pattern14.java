package patterns;

/* 
 * pattern to print:

A
A B
A B C
A B C D
A B C D E
A B C D E F

*/

public class Pattern14 {

	//increasing letter triangle pattern
	public void pattern(int n) {
		
		System.out.println("increasing letter triangle pattern:");
		
		//outer loop for rows
		for(int i = 0; i < n; i++) {
			

			//inner loop for columns
			for(char ch = 'A'; ch <= 'A' + i; ch++) {
				
				System.out.print(ch + " ");

			}
			
			System.out.println();
		}
	}
}

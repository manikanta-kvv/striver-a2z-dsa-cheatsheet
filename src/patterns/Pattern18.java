package patterns;

/* 
 * pattern to print:

F
E F
D E F
C D E F
B C D E F
A B C D E F

*/

public class Pattern18 {

	//alpha-triangle pattern
	public void pattern(int n) {
		
		System.out.println("alpha-triangle pattern:");
		
		char ch = (char)('A' + n -1);

		//outer loop for rows
		for(int i = 0; i < n; i++) {
			
			//inner loop for columns
			for(int j = 0; j <= i; j++) {
				
				System.out.print((char)(ch + j) + " ");
			}
			
			System.out.println();
			ch--;
		}
	}
}

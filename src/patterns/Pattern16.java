package patterns;

/* 
 * pattern to print:

A 
B B
C C C
D D D D
E E E E E
F F F F F F

*/

public class Pattern16 {
	
	//alpha-ramp pattern
	public void pattern(int n) {
		
		System.out.println("alpha-ramp pattern:");
		
		char ch = 'A';
		
		//outer loop for rows
		for(int i = 0; i < n; i++) {
			
			//inner loop for columns
			for(int j =  0; j <= i; j++) {
				
				System.out.print(ch + " ");
			}
			ch++;
			System.out.println();
		}
	}

}

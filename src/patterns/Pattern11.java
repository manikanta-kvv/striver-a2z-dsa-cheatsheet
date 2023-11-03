package patterns;

/* 
 * pattern to print:

1
01
101
0101
10101
010101

*/

public class Pattern11 {

	//binary number triangle pattern
	public void pattern(int n) {
		
		System.out.println("binary number triangle pattern:");
		
		//outer loop for rows
		for(int i = 1; i <= n; i++) {
			
			//inner loop for columns
			for(int j = 1; j <=i; j++) {
				
				if((i+j)%2 == 0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}

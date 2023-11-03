package patterns;

/* 
 * pattern to print:

1          1
12        21
12       321
1234    4321
12345  54321
123456654321

*/

public class Pattern12 {

	//number crown pattern
	public void pattern(int n) {
		
		System.out.println("number crown pattern:");
		
		//outer loop for rows
		for(int i = 1; i <= n; i++) {
			
			//inner loop for columns
			
			//for printing numbers at start
			for(int j = 1; j <= i ; j++) {		
				
				System.out.print(j);
			}
			
			//for printing spaces
			for(int j = 0; j < (2*n - 2*i); j++) {
				
				System.out.print(" ");
			}
			
			//for printing numbers at end
			for(int j = i; j > 0; j--) {
				
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
}

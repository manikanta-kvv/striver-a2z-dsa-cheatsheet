package patterns;

/* 
 * pattern to print:

6 6 6 6 6 6 6 6 6 6 6 
6 5 5 5 5 5 5 5 5 5 6 
6 5 4 4 4 4 4 4 4 5 6 
6 5 4 3 3 3 3 3 4 5 6 
6 5 4 3 2 2 2 3 4 5 6 
6 5 4 3 2 1 2 3 4 5 6 
6 5 4 3 2 2 2 3 4 5 6 
6 5 4 3 3 3 3 3 4 5 6 
6 5 4 4 4 4 4 4 4 5 6 
6 5 5 5 5 5 5 5 5 5 6 
6 6 6 6 6 6 6 6 6 6 6

*/

public class Pattern22 {

	//number pattern
	public void pattern(int n) {
		
		System.out.println("number pattern:");
		
		//outer loop for rows
		for(int i = 0; i < n; i++) {
			
			//inner loop for columns
			
			//for printing starting series
			for(int j = 0; j < i; j++) {
				System.out.print(n-j + " ");
			}
			
			//for printing middle series
			for(int j = i; j < 2*n - i - 1; j++) {
				
				System.out.print(n-i + " ");
			}
			
			//for printing ending series
			for(int j = n - i + 1; j <= n; j++) {
				
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
		
		for(int i = 1; i < n; i++) {
			
			//for printing starting series
			for(int j = 0; j < n - i; j++) {
				System.out.print(n-j + " ");
			}
			
			//for printing middle series
			for(int j = 0; j < 2*i - 1; j++) {
				System.out.print(i+1 + " ");
			}
			
			//for printing ending series
			for(int j = 0; j < n - i; j++) {
				System.out.print(i+j+1 + " ");
			}
			
			System.out.println();
		}
	}
}

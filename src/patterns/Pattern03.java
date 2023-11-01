package patterns;

/* 
 * pattern to print:

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6

*/

public class Pattern03 {
	
	//right-angled number pyramid pattern
	public void pattern(int n) {
		
		System.out.println("right-angled number pyramid pattern:");
		//outer loop for rows
		for(int i = 1; i <= n; i++) {
			
			//inner loop for columns
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

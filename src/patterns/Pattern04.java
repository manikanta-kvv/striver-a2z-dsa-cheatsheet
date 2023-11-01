package patterns;

/* 
 * pattern to print:

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6

*/

public class Pattern04 {

	//right-angled number pyramid pattern - II
	public void pattern(int n) {
		
		System.out.println("right-angled number pyramid pattern - II :");
		
		//outer loop for rows
		for(int i = 1; i <= n; i++) {
			
			//inner loop for columns
			for(int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}
}

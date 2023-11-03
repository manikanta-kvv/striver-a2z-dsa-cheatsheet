package patterns;

/* 
 * pattern to print:

1
2  3
4  5  6
7  8  9  10
11  12  13  14  15
16  17  18  19  20  21

*/

public class Pattern13 {
	
	//increasing number triangle pattern
	public void pattern(int n) {
		
		System.out.println("increasing number triangle pattern:");
		
		int num = 1;
		
		//outer loop for rows
		for(int i = 1; i <= n; i++) {
			
			//inner loop for columns
			for(int j = 1; j <= i; j++) {
				
				System.out.print(num + " ");
				num++;
			}
			
			System.out.println();
		}
	}
}

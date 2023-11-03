package patterns;

/* 
 * pattern to print:

     A     
    ABA    
   ABCBA   
  ABCDCBA  
 ABCDEDCBA 
ABCDEFEDCBA

*/

public class Pattern17 {

	//alpha-hill pattern
	public void pattern(int n) {
		
		System.out.println("alpha-hill pattern:");
		
		//outer loop for rows
		for(int i = 0; i < n; i++) {
			
			//inner loop for columns
			
			//for printing spaces at starting
			for(int j = 0; j < n-i-1 + 1; j++) {
				
				System.out.print(" ");
			}
			
			char ch = 'A';
			//for printing characters at middle
			for(int j = 1; j <= 2*i + 1; j++) {
				
				System.out.print(ch);
				
				if(j > (2*i+1)/2) {
					ch--;
				}
				else ch++;
				
			}
			
			//for printing spaces at ending
			for(int j = 0; j < n-i-1; j++) {
				
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}

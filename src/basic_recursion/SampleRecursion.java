package basic_recursion;

public class SampleRecursion {
	
	/*
	 * every recursion function must contain a base condition otherwise the loop will run continuously, and a recursive function call
	 */
	// print 1 to n
	// time complexity: O(n)
	// space complexity: O(n)
	public static void recursion(int i, int n) {
		
		//base condition
		if(i > n) return ;
		System.out.println("Your name");
		recursion(i+1, n);
	}
	
	//print n to 1
	// time complexity: O(n)
	// space complexity: O(n)
	public static void recurse(int i, int n) {
		
		//base condition
		if(i < 1) return;
		System.out.println(i);
		recurse(i-1, n);
	}
	
	// main method
	public static void main(String[] args) {
		
		recursion(1, 3);
		recurse(3, 3);

	}

}

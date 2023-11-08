package basic_hashing;

import java.util.Scanner;

public class SampleCharacterHashing {

	/*
	 * ascii value of small 'a' is 97, so for storing subsequent alphabets do, (char) - 'a', which gives index for that character
	 * for example, 'a' - 'a' = 0
	 * 'b' - 'a' = 1
	 * 'c' - 'a' = 2 and so on...
	 */
	public static void characterHashing_ap1(String word, char[] charArray) {
		//Assumption: Given word contains chars in lowercase
		int[] frequencyHashArray = new int[26];
		
		for(int i = 0; i < word.length(); i++) {
			frequencyHashArray[word.charAt(i) - 'a'] += 1;
		}
		
		for(int i = 0; i < charArray.length; i++) {
			int val = frequencyHashArray[charArray[i] - 'a'];
			System.out.println(charArray[i] + " occurs " + val + " times");
		}
		
	}
	
	
	public static void characterHashing_ap2(String word, char[] charArrray) {
		//If we don't know whether it contains lowercase or uppercase, use array size of 256
		int[] frequencyHashArray = new int[256];
		
		for(int i = 0; i < word.length(); i++) {
			frequencyHashArray[word.charAt(i)] += 1;
		}
		
		for(int i = 0; i < charArrray.length; i++) {
			int val = frequencyHashArray[charArrray[i]];
			System.out.println(charArrray[i] + " occurs " + val + " times");
		}
	}
	
	
	
	public static void main(String[] args) {

		// taking input array from user using Scanner class
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of the array: ");
//		int n = sc.nextInt();
//		int[] inputArr = new int[n];
//		System.out.println("Enter the values for the array: ");
//		for(int i = 0; i < n; i++) {
//			inputArr[i] = sc.nextInt();
//		}
//		
//		System.out.println("Enter the size of the countOf array:");
//		int m = sc.nextInt();
//		int[] countOf = new int[m];
//		System.out.println("Enter the values for the countOf array:");
//		for(int i = 0; i < m; i++) {
//			countOf[i] = sc.nextInt();
//		}
//		
		String word = "abcdabce";
		char[] charArray = {'a', 'c', 'e', 'g', 'b', 'd'};
		
		characterHashing_ap1(word, charArray);
		System.out.println("****************");
		characterHashing_ap2(word, charArray);

	}
	
}

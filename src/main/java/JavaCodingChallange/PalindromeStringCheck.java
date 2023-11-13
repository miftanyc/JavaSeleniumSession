package JavaCodingChallange;

import java.util.Scanner;

public class PalindromeStringCheck {
	String word;
	String reverseword;
	String originalword;

	public PalindromeStringCheck (String word) {
		this.word = word;
		this.reverseword = "";
		this.originalword = word;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a word _____________");
		String word = scanner.nextLine();
		
		// Creating the instance of this class
		PalindromeStringCheck crv = new PalindromeStringCheck(word);
		
		// Call the Method
			//crv.stringBuffer();
			//crv.stringBuilder();
			//crv.usingCharAt();
			//crv.usingtoCharArray();
	}
	
	// Logic 1: Using StringBuffer
	public void stringBuffer() {
		StringBuffer sb = new StringBuffer(word);
		StringBuffer revword = sb.reverse();
		
		//Changing the StringBuffer revword to String value
		String revwordstr = revword.toString();
		
		if (revwordstr.equals(word)) {
			System.out.println("This is a Palindrome Word");
		}else {
			System.out.println("This is NOT a Palindrome");
		}
	}
	
	// Logic 2: Using StringBuilder
	public void stringBuilder() {
		StringBuilder sd = new StringBuilder(word);
		StringBuilder revword1 = sd.reverse();
		
		// Convert StringBuilder revword1 to String Value
		String revword1str = revword1.toString();
		
		if(revword1str.equals(word)) {
			System.out.println("This is a Palindrome Word");
		}else {
			System.out.println("This is NOT a Palindrome");
		}
	}
	
	// Logic 3: Using CharAt		
	public void usingCharAt() {
		int l= word.length();
		for (int i = l-1; i>=0; i = i-1 ) {
			char character = word.charAt(i);
			reverseword = reverseword+character;
		}
		if (reverseword.equals(word)) {
			System.out.println("This is a Palindrome Word");
		}else {
			System.out.println("This is NOT a Palindrome");
		}
	}
	
	
	// Logic 4: Using toCharArray
	public void usingtoCharArray() {
		// Create a String array
		char[] a = word.toCharArray(); // Storeing array as char
		int l = word.length();
		for(int i = l-1; i>=0; i=i-1) { // abc l=3 index 012
			reverseword = reverseword+a[i];
		}
		if (reverseword.equals(word)) {
			System.out.println("This is a Palindrome Word");
		}else {
			System.out.println("This is NOT a Palindrome");
		}
	}
}

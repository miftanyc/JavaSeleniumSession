package JavaCodingChallange;

import java.util.Scanner;

public class StringReverse {

	String word;
	String reverse;
	
	public StringReverse (String word) {
		this.word = word;
		this.reverse = "";
	}
	 
	public static void main(String[] args) {
		 Scanner scanner = new Scanner (System.in);
		 System.out.println("Type a word __________.");
		 String word = scanner.nextLine();
		 
		 // Create instance of this class
		 StringReverse sr= new StringReverse(word);
		 
		 //Call the Method
		 //sr.stringConcatenation();
		 //sr.charArray();
		 sr.stringBuffer();
		 
	}

	//Logic 1: Using String Concatenation operator [charAt]
	public void stringConcatenation() {
		int length = word.length();
		//Create a for loop
		for (int i = length-1; i>=0; i=i-1) {
			reverse = reverse + word.charAt(i);
		}
		System.out.println("Reverse word is: "+reverse);
	}
	
	//Logic 2: Using Character Array [toCharArray]
	public void charArray() {
		char[] a = word.toCharArray();
		int length = a.length;
		//Create a For Loop
		for (int i = length-1; i>=0; i = i-1) {
			reverse = reverse + a[i];
		}
		System.out.println("Reverse Word is: "+reverse);
	}
	
	//Logic 3: Using StringBuffer
	public void stringBuffer() {
		StringBuffer sbuf= new StringBuffer(String.valueOf(word));
		StringBuffer rev = sbuf.reverse();
		System.out.println("Reverse Word is: "+rev);
	}
}

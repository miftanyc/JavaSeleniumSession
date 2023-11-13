package JavaCodingChallange;

import java.util.Scanner;

public class PalindromeNumberCheck {
	// To check Provided Number is a Palindrome Number or Not?
	
	int num;
	int rev;
	int originalNumber;
	
	public PalindromeNumberCheck(int num) {
		this.num = num;
		this.rev = 0;
		this.originalNumber = num;
	}
	
	public static void main(String[] args) {
		//Using Scanner Tool
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number ________");
		int num = scanner.nextInt();
		int originalNumber = num;
		
		// Creating instance of this Class
		PalindromeNumberCheck obj = new PalindromeNumberCheck(num);
		
		// Call the Method
			obj.stringBuffer();
			obj.usingWhileLoop();
	}
	
	//Logic 1: Using StringBuffer
	public void stringBuffer() {
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer reverse = sb.reverse();
		
		//Converting StringBuffer Reverse to String reverseStr
		String reverseStr = reverse.toString();
		
		// Check using if Condition
		if(String.valueOf(originalNumber).equals(reverseStr)) {
			System.out.println("This is a palindrome");
		}else {
			System.out.println("This is NOT a palindrome");
		}
	}
	
	
	//Logic 2: Using While Loop
	public void usingWhileLoop() {
		while (num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		if (originalNumber==rev) {
			System.out.println("This is a palindrome");
		}else {
			System.out.println("This is NOT a palindrome");
		}
	}
}


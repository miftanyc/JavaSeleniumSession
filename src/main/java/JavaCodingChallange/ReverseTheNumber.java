package JavaCodingChallange;

import java.util.Scanner;

public class ReverseTheNumber {
	// Instance variable to store Provided Number and its Reverse
	int num; // To store provided number
	int rev; // To store Reverse number
	
	// Constractor to initialized instance variable 
	public ReverseTheNumber(int num) {
		this.num = num;
		this.rev = 0;
	}
	
	// Logic 1: Using While Loop
	public void usingWhileLoop() {
		// Storing Original Number before Modification
		int OriginalNumber = num;
		while(num!=0) {
			rev = rev*10+ num%10;
			num = num/10;
		}
		System.out.println("Original Number: "+OriginalNumber);
		System.out.println("Reverse Number: "+rev);
	}
	
	
	// Logic 2: using StringBuffer
	public void usingStringBuffer() {
		// Storing Original Number before Modification
		int OriginalNumber = num;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer reverse = sb.reverse();
		System.out.println("Original Number: "+OriginalNumber);
		System.out.println("Reverse Number: "+reverse);
		
	}
	
	
	// Logic 3: Using StringBuilder
	public void usingStringBuilder() {
		int OriginalNumber1 = num;
		StringBuilder sbl = new StringBuilder(String.valueOf(num));
		StringBuilder reverse1 = sbl.reverse();
		System.out.println("Original Number: "+ OriginalNumber1);
		System.out.println("Reverse Number: "+ reverse1);
	}
	
	
	public static void main(String[] args) {
		// Using Scanner to input the Number
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your desired Number: ");
		int num = scanner.nextInt();
		
		//Creating an Instance of ReverseNumber Class
		ReverseTheNumber crv = new ReverseTheNumber(num);
		
		// Calling the Methods
		crv.usingWhileLoop();
		//crv.usingStringBuffer();
		//crv.usingStringBuilder();
	}
}

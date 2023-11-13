package JavaCodingChallange;

import java.util.Scanner;

public class FindingLargestNumber {
	// Define the variable
	int a;
	int b;
	int c;
	
	//Define the constractor
	public FindingLargestNumber(int a, int b, int c) {
		this.a= a;
		this.b= b;
		this.c= c;
	}
	
	public static void main(String[] args) {
		//Creating Scanner
		Scanner scanner = new Scanner(System.in);
		//Ask the Value and input the data
		System.out.println("Enter Values for [a]: ");
		int a = scanner.nextInt();
		System.out.println("Enter Values for [b]: ");
		int b = scanner.nextInt();
		System.out.println("Enter Values for [c]: ");
		int c = scanner.nextInt();
		
		// Create the instance of this class
		
		FindingLargestNumber crv = new FindingLargestNumber(a, b, c);
		
	//Call the Method
		//crv.usingComparisn();
		//crv.usingTernaryOperator();
		//crv.ternaryOperatorSingleLineStatement();
	}
	
	
	//Logic 1: Using Comparisn
	public void usingComparisn() {
		if (a>b && a>c) {
			System.out.println(a+ " is the largest number.");
		}else if (b>a && b>c) {
			System.out.println(b+ " is the largest number.");
		}else {
			System.out.println(c+ " is the largest number.");
		}
	}

	
	//Logic 2: Ternary operator [? and :]
	public void usingTernaryOperator() {
		int largest = a>b ? a:b;			// largest of a & b
		largest = c>largest ? c:largest;	// new largest between c and old largest
		System.out.println(largest+ " is the largest Number");
	}
	
	
	//Logic 3: Using Ternary Operator in a single line statement
	public void ternaryOperatorSingleLineStatement() {
		int largest = ((c>((a>b) ? a:b))? c:((a>b) ? a:b));
		System.out.println(largest+ " is the largest number.");
	}
}

	// c>((a>b)? a:b) ? c: ((a>b)? a:b)


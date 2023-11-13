package JavaCodingChallange;

import java.util.Scanner;

public class FibonacciNumberSeries {

	int n1;
	int n2;
	int sum;
	String FS;
	
	// Calling the constactor
	public FibonacciNumberSeries(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
		this.sum = 0;
		this.FS = n1+", "+n2;
	}

	
	public static void main(String[] args) {
		//Calling the scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Values for First Number.");
		int n1 = scanner.nextInt();
		System.out.println("Enter Values for Second Number.");
		int n2 = scanner.nextInt();
		
		//Creating instance of a class
		FibonacciNumberSeries fn = new FibonacciNumberSeries(n1, n2);
		
		//Call the Method
		fn.usingSeriesSummation();
	}
	
	//Logic 1: Using Series Summation
	public void usingSeriesSummation() {
		for(int i = 0; i<10; i=i+1) {
			sum = n1+n2;
			FS = FS+", "+sum;
			n1=n2;
			n2=sum;
		}
		System.out.print("Fibonacchi Series are: ");
		System.out.println(FS);
	}
}

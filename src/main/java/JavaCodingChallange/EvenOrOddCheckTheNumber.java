package JavaCodingChallange;

import java.util.Scanner;

public class EvenOrOddCheckTheNumber {
	
	//Define variable
	int num;
	
	// Create Constructor
	public EvenOrOddCheckTheNumber(int num) {
		this.num = num;
	}
	
	public static void main(String[] args) {
		// Create Scanner Object
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number to Check, Is it Even or Odd Number");
		int num = scanner.nextInt();
		
		//Create class referential variable of this class
		EvenOrOddCheckTheNumber crv = new EvenOrOddCheckTheNumber(num);
		
		// Call the Method
		crv.runTheNumber();
	}
	
	public void runTheNumber() {
		if (num%2 == 0) {
			System.out.println(num+" is a EVEN Number");
		}else {
			System.out.println(num+" is a ODD Number");
		}
	}

}

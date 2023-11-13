package JavaCodingChallange;

import java.util.Scanner;

public class PrimeNumberValidation {

	int num;
	int count;
	
	// Create the constructor
	public PrimeNumberValidation(int num) {
		this.num = num;
	}
	
	
	public static void main(String[] args) {
		//Scanner to input value
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = scanner.nextInt();
		
		// Create instance of this class
		PrimeNumberValidation crv = new PrimeNumberValidation(num);
		
		//Call the Method
		crv.primeNumberCheck();
	}
	
	//Logic: to find the provide number is a Prime number or Not?
	public void primeNumberCheck() {
		// Number need to be >1
		//Number can be divide by 1 and its own value.
		
		if (num>1) {
			for (int i=1; i<=num; i++) {
				if (num%i==0) {
					count = count+1;
				}				
			}	// End of for Loop
			if (count==2) {
				System.out.println("This is a PRIME Number");
			}else {
				System.out.println("This is NOT a Prime Number");
			}	//End of Second if else
		}else {
			System.out.println("This is NOT a Prime Number");
		}	// End of First if else

	}	// End of Method

}	// End of Class

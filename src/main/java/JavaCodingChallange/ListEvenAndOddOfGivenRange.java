package JavaCodingChallange;

import java.util.Scanner;

public class ListEvenAndOddOfGivenRange {

	// Define the variable
	int LowestRange;
	int HighestRange;
	String Even = "Even Number Are: ";
	String Odd = "Odd Number Are: ";
	
	// set the constructor
	public ListEvenAndOddOfGivenRange(int LowestRange, int HighestRange) {
		this.LowestRange = LowestRange;
		this.HighestRange = HighestRange;
	}
	
	public static void main(String[] args) {
		// Create Scanner Object
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Lowest Range");
		int LowestRange = scanner.nextInt();
		System.out.println("Enter The Highest Range");
		int HighestRange = scanner.nextInt();
		
		// Create the Class referential variable
		ListEvenAndOddOfGivenRange crv  = new ListEvenAndOddOfGivenRange(LowestRange, HighestRange);
		
		//Call The Method
		crv.evenAndOdd();

	}			// 2                  4
	
	public void evenAndOdd() {
		for (int i = LowestRange; i<=HighestRange; i++) {
			if(i%2==0) {
				Even = Even + "  " +i;
			}else {
				Odd = Odd+ "  " +i;
			}
		}
		System.out.println(Even);
		System.out.println(Odd);
	}

}

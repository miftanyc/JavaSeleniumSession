package JavaCodingChallange;

public class EvenAndOddFromArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		String Even = "Even Number Are: ";
		String Odd = "Odd Number Are: ";
		
		//Print Even Number
		for (int i=0; i<a.length; i++) {
			if (a[i]%2 == 0){
				int singleEvenNumber = a[i];
				Even = Even+"  "+singleEvenNumber;
			} 
		}
		System.out.println(Even);
		
		
		//Print Odd Number
		for (int j=0; j<a.length; j++) {
			if(a[j]%2 != 0) {
				int SingleOddNumber = a[j];
				Odd = Odd+"  "+SingleOddNumber;
			}
		}
		System.out.println(Odd);
	}
}

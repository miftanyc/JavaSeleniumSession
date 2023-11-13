package JavaCodingChallange;

import java.util.Arrays;
import java.util.Collections;

public class SortingElementOfArray {

	int[] a = {20, 30, 10, 50, 60, 40};
	
	public static void main(String[] args) {
		//Create Class Refferential variable
		SortingElementOfArray crv = new SortingElementOfArray();
		
		//Call The Method
		//crv.parallelSortMethod();
		//crv.sortMethod();
		crv.sortElementDescending();

	}
	
	//Logic 1: Using Array.parallelSort() Method
	public void parallelSortMethod() {
		// Store Int[] a into String Value
		String AStr = Arrays.toString(a);
		// Print Before Sorting
		System.out.println("Array Element Before sorting are: "+ AStr);
		
		
		//Sorting the Element
		Arrays.parallelSort(a);
		
		//Store the Sorting Element value as String Value
		String SortElementStr = Arrays.toString(a);
		
		//Print After Sorting
		System.out.println("Array Element After sorting are: "+ SortElementStr);
	}
	
	
	
	//Logic 2: Using Array.sort() Method
	public void sortMethod() {
		//Storing int[] a into String value
		String AStr = Arrays.toString(a);
		//Print the element before sorting value
		System.out.println("Array Element Before Sorting Are: "+AStr);
		
		//Sorting the Element
		Arrays.sort(a);
		
		//Sorting Sorted value into String
		String SortElementStr = Arrays.toString(a);
		//Print the element after sorting element
		System.out.println("Array Element After Sorting Are: "+SortElementStr);
	}
	
	
	//Logic 3: Sorting Element in Descending Order
	public void sortElementDescending() {
		//Define Variable to Wrapper Class Integer [Non-Primitive]
		Integer[] IntA = {20, 30, 10, 50, 60, 40};
		
		//Store IntA to String Value
		String IntAStr = Arrays.toString(IntA);
		//Pring Element before Sorting
		System.out.println("Array Element Before Sorting Are: "+ IntAStr);
		
		//Sort The Element Descending Order
		Arrays.sort(IntA,Collections.reverseOrder());
		//Storing Descending order Element into String value
		String DescElementStr = Arrays.toString(IntA);
		//Print Array Element in Descending Order
		System.out.println("Array Element After Sorting in DESCENDING order are: "+DescElementStr);		
	}
	
}

package CoreJava.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLearning {

    public static void main(String[] args) {
        // Creating object for ArrayList
        ArrayList<Integer> alist = new ArrayList<Integer>();


        //Adding Object for Arraylist [Not value]
        alist.add(2);    // Stored at index 0
        alist.add(4);    // Stored at index 1
        alist.add(8);    // Stored at index 2
        alist.add(9);    // Stored at index 3


        // Getting the value stored in ArrayList
        System.out.println("Values at Index 0 [2] : " + alist.get(0));
        System.out.println("Values at Index 1 [4] : " + alist.get(1));
        System.out.println("Values at Index 2 [8] : " + alist.get(2));
        System.out.println("Values at Index 3 [9] : " + alist.get(3));


        //Getting the Size of of the ArrayList
        System.out.println("Size of Array List: " + alist.size());


        // Print Values in For Loop
        for (int i = 0; i < alist.size(); i = i + 1) {
            System.out.println("Values at Index " + i + ": " + alist.get(i));
        }

        // Print Value using ForEach Loop
        System.out.print("Values ArrayList are: ");
        for (Integer i : alist) {
            System.out.print(i + " ");
        }
        System.out.println();


        //Print value using while loop of Iterator<E> interface and Iterator() Method
        Iterator<Integer> itr = alist.iterator(); // Call the Method and Stored in Interface variable


        while (itr.hasNext()) { // boolean: is there any value
            System.out.print(itr.next()); // Value Printed here
        }
        System.out.println("  Are Values of Array List Printed using while loop with Iterator<E> interface and iterator() Method");


    }

}

	/*----------------------------------------------------------------------
	 ⏹️ .length
	 	☑️ Predefined variable*** to get the size of Array
	 	
	 ⏹️ .length()
	 	☑️ Predefined Method*** to get the size of String.
	 	
	 ⏹️ .size()
	 	☑️ Predefined Method*** to get the size of ArrayList
	  
	 -----------------------------------------------------------------------*/

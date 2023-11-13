package CoreJava.collectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListScannerInput {


    //Create a Static instance of ArrayList
    static ArrayList<String> alist = new ArrayList<String>();

    //Learning HashMap
    public static void main(String[] args) {

        //Create Scanner Object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st Value: ");
        String word1 = scanner.nextLine();
        System.out.println("Enter 2nd Value: ");
        String word2 = scanner.nextLine();
        System.out.println("Enter 3rd Value: ");
        String word3 = scanner.nextLine();
        System.out.println("Enter 4th Value: ");
        String word4 = scanner.nextLine();
        System.out.println("Enter 5th Value: ");
        String word5 = scanner.nextLine();

        //Input the Scanned data into ArrayList
        alist.add(word1);
        alist.add(word2);
        alist.add(word3);
        alist.add(word4);
        alist.add(word5);


        //Create Class Refferential Variable
        ArrayListScannerInput crv = new ArrayListScannerInput();

        //Call The Method
        crv.byForEachLoop();
        crv.byForLoop();

    }

    public void byForEachLoop() {
        System.out.println("Values of Array List Input by For-Each Loop _ _ _ _ _");
        for (String i : alist) {
            System.out.println(i);
        }
    }

    public void byForLoop() {
        System.out.println("Values of Array List Input by For Loop _ _ _ _ _");
        for (Integer i = 0; i < alist.size(); i++) {
            System.out.println(alist.get(i));
        }
    }

}

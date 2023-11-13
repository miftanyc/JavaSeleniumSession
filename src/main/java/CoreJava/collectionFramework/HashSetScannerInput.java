package CoreJava.collectionFramework;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetScannerInput {

    // Create Static obj of HashSet
    static HashSet<Integer> hset = new HashSet<Integer>();    // For Integer
    static HashSet<String> hstring = new HashSet<String>();    // For String

    //Create Scanner Object
    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        //Create Class referential variable
        HashSetScannerInput crv = new HashSetScannerInput();

        //Call the method
        //crv.integerValue();
        crv.stringValue();

    }

    // Logic 1: Use Integer Value and then Print
    public void integerValue() {
        //Create Scanner Object
        System.out.println("Enter FIRST Number");
        Integer num1 = scanner.nextInt();
        System.out.println("Enter SECOND Number");
        Integer num2 = scanner.nextInt();
        System.out.println("Enter THIRD Number");
        Integer num3 = scanner.nextInt();
        System.out.println("Enter FOURTH Number");
        Integer num4 = scanner.nextInt();
        System.out.println("Enter FIFTH Number");
        Integer num5 = scanner.nextInt();


        //Storing the Value to HashSet
        hset.add(num1);
        hset.add(num2);
        hset.add(num3);
        hset.add(num4);
        hset.add(num5);


        //Get the Size of the HashSet
        System.out.println("Size of the HashSet: " + hset.size());


        //Print the HashSet Values using For Each Loop
        System.out.println("HashSet Integer values using For-Each Loop _ _ _ _ _");
        for (Integer i : hset) {
            System.out.println(i);
        }
    }

    // As the is no INDEX in HashSet So we CANNOT use For Loop


    //Logic 2: Use String Value and Print
    public void stringValue() {
        System.out.println("Enter FIRST Word");
        String word1 = scanner.nextLine();
        System.out.println("Enter SECOND Word");
        String word2 = scanner.nextLine();
        System.out.println("Enter THIRD Word");
        String word3 = scanner.nextLine();
        System.out.println("Enter FOURTH Word");
        String word4 = scanner.nextLine();
        System.out.println("Enter FIFTH Word");
        String word5 = scanner.nextLine();


        //Add Values to HashSet
        hstring.add(word1);
        hstring.add(word2);
        hstring.add(word3);
        hstring.add(word4);
        hstring.add(word5);


        //Print Size of HashSet
        System.out.println("Size of Hashset: " + hstring.size());


        //Print HashSet Values using For-Each Loop
        System.out.println("HashSet String values using For-Each Loop _ _ _ _ _");
        for (String j : hstring) {
            System.out.println(j);
        }
    }
    // As the is no INDEX in HashSet So we CANNOT use For Loop


}

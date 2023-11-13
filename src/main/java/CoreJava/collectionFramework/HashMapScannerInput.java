// HashMap is a KEY and Value Class data [Name, Mifta]; Here Name is Key, Mifta is Value.

package CoreJava.collectionFramework;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapScannerInput {

    //Create Static Object for HashMap
    HashMap<Integer, String> hm = new HashMap<Integer, String>();

    //Create Scanner Object
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Create Instance of this class
        HashMapScannerInput crv = new HashMapScannerInput();


        //Call the Method
        crv.hashMapMethod();

    }

    public void hashMapMethod() {
        //Ask by Scanner to Input
        System.out.println("Enter FIRST Employee ID");
        Integer empID1 = scanner.nextInt();
        System.out.println("Enter FIRST Employee Name");
        String empName1 = scanner.next();
        System.out.println("Enter SECOND Employee ID");
        Integer empID2 = scanner.nextInt();
        System.out.println("Enter SECOND Employee Name");
        String empName2 = scanner.next();
        System.out.println("Enter THIRD Employee ID");
        Integer empID3 = scanner.nextInt();
        System.out.println("Enter THIRD Employee Name");
        String empName3 = scanner.next();
        System.out.println("Enter FOURTH Employee ID");
        Integer empID4 = scanner.nextInt();
        System.out.println("Enter FOURTH Employee Name");
        String empName4 = scanner.next();
        System.out.println("Enter FIFTH Employee ID");
        Integer empID5 = scanner.nextInt();
        System.out.println("Enter FIFTH Employee Name");
        String empName5 = scanner.next();

        //Add the data to Hashmap
        hm.put(empID1, empName1);
        hm.put(empID2, empName2);
        hm.put(empID3, empName3);
        hm.put(empID4, empName4);
        hm.put(empID5, empName5);

        //Print the values
        System.out.println("Values of HashMap Data: ");
        for (Integer key : hm.keySet()) {
            String value = hm.get(key);
            System.out.println(key + " = " + value);
        }

    }

}

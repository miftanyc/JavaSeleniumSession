package CoreJava.classesObjectsStringsWrapperclasses;

public class StringClasses {

    public static void main(String[] args) {
        //additionOperator();
        //concatenationOperator();
        //stringEqualsMethod();
        //stringLengthsMethod();
        //stringLengthsMethod();
        //stringSubstringMethod();
        //stringTrimmedName();
        //stringIndexOfMethod();
        stringSplitMethod();

    }

    public static void additionOperator() {
        int a = 4 + 5; // Addition Operator
        System.out.println(a);
    }

    public static void concatenationOperator() {
        String FullName = "Mifta" + " " + "Chowdhury"; // Concatenation Operator
        System.out.println(FullName);
    }

    public static void stringEqualsMethod() {
        String FirstName = "Mifta";
        System.out.println("Mifta".equals(FirstName));// True
    }

    public static void stringLengthsMethod() {
        String FirstName1 = "Mifta";
        String LastName1 = "Chowdhury";
        String FullName1 = FirstName1 + " " + LastName1;
        //Number of Character calculated by .lenght() method
        System.out.println("Number of Character in FullName: " + FullName1.length());
    }

    public static void stringSubstringMethod() {
        String FirstName2 = "Mifta";
        String LastName2 = "Chowdhury";
        String FullName2 = FirstName2 + " " + LastName2;
        System.out.println("Chow Portion of my FullName: " + FullName2.substring(6, 10));// These number are index number. First Letter M in Index 0;
    }

    public static void stringTrimmedName() {
        String Name1 = "       Mifta Chowdhury       ";
        String trimmedName = Name1.trim();
        System.out.println(trimmedName);
    }

    public static void stringIndexOfMethod() {
        String Para = "This text is written by Mifta Chowdhury";
        System.out.println(Para.indexOf("Mifta")); // this will find out the word "Mifta" available or not if available it gonna give the index location of that word. If word not available in that case console will return -1 index.
    }

    public static void stringSplitMethod() {
        String Para1 = "This Text Is Written By Mifta Chowdhury";
        String[] a = Para1.split(" ");
        for (String i : a) {
            System.out.println(i);
        }
    }
}

/*Difference between Primitive Data types vs Non-Primitive Data Types
 * 	Primitive Data Types
 * 			Non Object Type
 * 			int, shot, long, byte, double, float, char, boolean
 *
 * 	Non-Primitive data Type
 * 			Object oriented
 * 			Array, String,
 *
 *		Traditional Expression:	String Name = new String("Mifta");
 *		Shortcut Expression:	String Name = "Mifta";
 */


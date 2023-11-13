// Learning on Exception

package CoreJava.exceptionHandling;

public class Exceptiondemo {

    public static void main(String[] args) {
        // Example of Compiler Error
        //int a = "Mifta";
        // Here data type is int but value is String type, So compiler of Java Application Find out any Syntex mismatch and shows as Compiler error.


        // Example of Runtime Error or Exception
        int b = 10 / 0;
        // Here no error in java syntex so no compiler error, but its not possible to divide anything with zero, So this is Arithmatic Execption.

    }

}

/*********************************
 There is Two type of Error
 a> Compiler Error
 b> Runtime Error [AKA Exception]
 ***** EXCEPTION OCCUR ONLY AT THE RUNTIME******
 ***********************************/
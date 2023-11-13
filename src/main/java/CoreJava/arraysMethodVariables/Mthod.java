// Learning on Method
/*	i. Void Method
 * 		This method will return Nothing
 * 	ii. Return Method
 * 		This method will Return Something
 *
 */

package CoreJava.arraysMethodVariables;

public class Mthod {

    public static void main(String[] args) {
        int result = calculatorReturnMethod(6, 4);
        System.out.println("summation of 6+4= " + result + " [Return Method]");

        voidMethod();

    }

    // Example of Return Method
    public static int calculatorReturnMethod(int a, int b) {
        int sum = a + b;
        return sum; // This value is returned to Main Mathod during Call
    }

    //Example of Void Method
    public static void voidMethod() {
        int a = 6, b = 4;
        int sum = a + b;
        System.out.println("summation of 6+4= " + sum + " [Void Method]");
        // This value is not returned to Main Method instead VoidMethod execute via Main Method to get the result
    }
}

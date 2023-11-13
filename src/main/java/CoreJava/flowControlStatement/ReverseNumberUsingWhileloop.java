// Learning Reversing the Number

package CoreJava.flowControlStatement;

public class ReverseNumberUsingWhileloop {

    public static void main(String[] args) {
        //Procedure: 1
        int number = 1234;
        int revNumber = revNumMethod(number);

        System.out.println("Printing of original number: " + number);
        System.out.println("Printing of reverse number " + revNumber);

        //Procedure: 2
        procedureTwo();

        //Procedure 3
        procedureThree();

        //Procedure 4
        procedureFour();
    }

    public static int revNumMethod(int providedNum) {
        int revNumber = 0;
        while (providedNum != 0) {
            int digit = providedNum % 10;
            revNumber = revNumber * 10 + digit;
            providedNum = providedNum / 10;
        }
        return revNumber;
    }


    //Procedure 2
    public static void procedureTwo() {
        int a = 234; // Provided number

        while (a > 0) {
            System.out.print(a % 10);
            a = a / 10;
        }
        System.out.println();
    }


    //Procedure 3
    public static void procedureThree() {

        for (int a = 489; a > 0; a = a / 10) {
            int b = a % 10;
            System.out.print(b);
        }
        System.out.println();
    }


    //Procedure 4
    public static void procedureFour() {
        int num = 234;
        int reverse = 0;

        while (num != 0) {
            int modulus = num % 10;
            reverse = reverse * 10 + modulus;
            num = num / 10;
        }
        System.out.println(reverse);
    }
}

package JavaCodingChallange;

public class FactorialNumber {
    //Factorial 5! = 1x2x3x4x5=120

    public static void main(String[] args) {

        int num=5;
        int factorial = 1;
        for(int i=1; i<=5; i++){
            factorial = factorial*i;
        }
        System.out.println("Factorial of "+ num + " is : " + factorial);
    }
}

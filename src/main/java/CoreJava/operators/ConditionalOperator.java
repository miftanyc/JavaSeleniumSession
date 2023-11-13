//Learning on Conditional Operator 

package CoreJava.operators;

public class ConditionalOperator {
    public static void main(String[] args) {
        // Conditional Operator
        int a = 5, b = 9;

        boolean c = (a > b) ? true : false; //AKA Ternary Operator
        System.out.println(c);


        String Check = (a > b) ? "A is Greater Than B" : "B is Grater than A";
        System.out.println(Check);


    }
}
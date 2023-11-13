// Logical Operators OR ||

package CoreJava.operators;

public class LogicalOperatorsOR {
    public static void main(String[] args) {
        //Logical Operators
        boolean a = true, b = false, c = true, d = false;

        System.out.println(a || b);
        //If one is True than its True
        System.out.println(a || c);
        // as both are True than its True
        System.out.println(b || c);
        // If one is True than its True
        System.out.println(b || d);
        // if both are false than its False
        //To be False both need to be False in OR operator
    }
}

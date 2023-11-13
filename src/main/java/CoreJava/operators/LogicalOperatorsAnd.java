// Logical Operators And &&

package CoreJava.operators;

public class LogicalOperatorsAnd {
    public static void main(String[] args) {
        //Logical Operators
        boolean a = true, b = false, c = true, d = false;

        System.out.println(a & b);
        // if both are not same than False
        System.out.println(a && c);
        // if both are True than its True
        //To be true both need to be True in And Operator
        System.out.println(b && c);
        // if both are not same than its False
        System.out.println(b && d
        );
        // if both are false than its False
    }
}

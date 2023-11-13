// Assignment Operators 

package CoreJava.operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        //Assignment Operators
        int a = 5, b = 9, c, d = 10;

        System.out.println(c = a); // c will have same value as a

        a += 4; // It means a= a+4 = 5+4 = 9
        System.out.println(a);

        d -= 2; // It means d= d-2 = 10-2 = 8
        System.out.println(d);

    }
}

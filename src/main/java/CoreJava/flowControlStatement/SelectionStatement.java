//Learning of Flow Control Statement
/* 3 Types of Flow Control Statement
 * 		1. Selection Statement
 * 				a. if [1 condition]
 * 				b. if else [1 condition]
 * 				c. if...else if...if [2 or more condition]
 * 				d. switch [1 condition]
 * 		2. Iterative Statement
 * 		3. Transfer Statement
 */


package CoreJava.flowControlStatement;

public class SelectionStatement {


    public static void main(String[] args) {
        //ifStatement();
        //ifElseStatement1();
        //ifElseStatement2();
        //ifElseifElsestatement();
        //switchStatement1();
        //switchStatement2();
    }


    public static void ifStatement() {
        int a = 9, b = 5;
        if (a > b) {
            System.out.println("IfStatement Method: If block: a is grater than b  \n");
        }
    }
    // "\n" give line break after the execution


    public static void ifElseStatement1() {
        int MiftaSaving = 30000, CarPrice = 23000;
        if (MiftaSaving > CarPrice) {
            System.out.println("IfElseStatement1 Method: If Block: Mifta Can Purchase The Car  \n");
        } else {
            System.out.println("IfElseStatement1 Method: Else Block: Mifta Needs To Apply For Loan To Purchase This Car  \n");
        }
    }


    public static void ifElseStatement2() {
        int MiftaSaving = 19000, CarPrice = 23000;
        if (MiftaSaving > CarPrice) {
            System.out.println("IfElseStatement1 Method: If Block: Mifta Can Purchase The Car  \n");
        } else {
            System.out.println("IfElseStatement2 Method: Else Block: Mifta Needs To Apply For Loan To Purchase This Car  \n");
        }
    }


    public static void ifElseifElsestatement() {
        int a = 5, b = 4, c = 3, d = 2, e = 1;
        if (a < b) {
            System.out.println("ifElseifElsestatement Method:  a<b  \n");
        } else if (b < c) {
            System.out.println("ifElseifElsestatement Method:  b<c  \n");
        } else if (c < d) {
            System.out.println("ifElseifElsestatement Method:  c<d  \n");
        } else if (d < e) {
            System.out.println("ifElseifElsestatement Method:  d<e  \n");
        } else {
            System.out.println("ifElseifElsestatement Method:  e is the least Number  \n");
        }
    }


    // Learning on Switch Case Selection Statement
    public static void switchStatement1() {

        int a = 2;

        switch (a) {

            case 0:
                System.out.println("Switch Statement: Case 0 Executed");
                break;
            case 1:
                System.out.println("Switch Statement: Case 1 Executed");
                break;
            case 2:
                System.out.println("Switch Statement: Case 2 Executed");
                break;
            case 3:
                System.out.println("Switch Statement: Case 3 Executed");
                break;
            default:
                System.out.println("Switch Statement: No Match Found");
        }
    }


    public static void switchStatement2() {
        String FoodAskedFor = "Tandori";

        switch (FoodAskedFor) {

            case "Cake":
                System.out.println("Cake will be served");
                break;
            case "Soda":
                System.out.println("Soda will be served");
                break;
            case "Rice":
                System.out.println("Rice will be served");
                break;
            case "Tandori":
                System.out.println("Tandori will be served");
                break;
            default:
                System.out.println("The Food you asked we dont prepare it");
        }
    }
}

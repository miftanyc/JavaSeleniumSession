/*4 types of Transfer Statement
 * 		a. break
 * 		b. continue
 * 		c. return
 * 		d. try, catch, finally
 */


package CoreJava.flowControlStatement;

public class TransferStatement {

    public static void main(String[] args) {
        //breakUsingSwitch();
        //breakUsingForLoop1();
        //breakUsingForLoop2();
        //continueUsingForLoop();
    }

    // break statement used in selection statement: "switch". [check for it]
    public static void breakUsingSwitch() {
        String FoodAskedFor = "Chocolate";

        switch (FoodAskedFor) {
            case "Tea":
                System.out.println("Tea will be served");
                break;
            case "Chocolate":
                System.out.println("Chocolate will be served");
                break;
            case "Tandori":
                System.out.println("Tandori will be served");
                break;
        }
    }


    //break statement used in for loop
    public static void breakUsingForLoop1() {
        for (int i = 0; i < 5; i++) { // instead of i++ you can write i=i+1;
            if (i == 3) {
                break;
            }
            System.out.println("i value is: " + i);
        }
        System.out.println("break condition break the for loop when i value equal to 3\n");
    }


    public static void breakUsingForLoop2() {
        for (int a = 0; a < 9; a += 2) {//2 increment for a
            if (a > 7) {
                break;
            }
            System.out.println("a value is: " + a);
        }
        System.out.println("break condition break the for loop when a value is more than 7");
    }


    // continue statement used in for loop
    //This will only skip the code when the condition is matched and rest will continue
    public static void continueUsingForLoop() {
        for (int b = 0; b < 10; b++) {
            if (b == 4) {
                continue;
            }
            System.out.println("b value is: " + b);
        } //only value of b: 4 will be skipped and rest will be continue [what ever condition matched it will be skipped that the continue does]
    }
}

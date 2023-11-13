//Learning on Iterative Statement
/*This statement help executing the same block of code multiple times
 * 4 Different Types of Iterative Statement
 * 			a. while loop
 * 			b. do while loop
 * 			c. for loop
 * 			d. for-each loop
 */

package CoreJava.flowControlStatement;

public class IterativeStatement {

    public static void main(String[] args) {
        //whileLoopinfIniteLoop();
        //whileLoop();
        //doWhileLoop1();
        //doWhileLoop2();
        //forLoop();
    }


    //while loop Demonstration
    public static void whileLoopinfIniteLoop() {
        //InfiniteLoop [The is no condition to break the loop]
        // Do not run this loop it can crush computer

        int a = 5, b = 4;

        while (a > b) {
            System.out.println("Infinite loop: a is grater than b");
        }
    }

    public static void whileLoop() {
        // **** While loop Condition is Checked first then Execute the block of code
        // If the condition is false Zero times code will be executed

        int i = 0;
        while (i < 5) {
            System.out.println("I value will be increment by one upto five time than the loop will terminated");
            System.out.println("Now i value is: " + i);
            i++; // This will increment i value by 1 each times once it become 5, the code will be terminated

            /* 1st Time i value was 0,
             * Then by i++ make it one, Now i value is 1,
             * Again i++ make its value 1+1=2
             * This way when i value reach its value 5 it will break the loop
             */
        }
    }


    public static void doWhileLoop1() {
        // **** Block of code executed first than condition is checked
        // If the condition is False One times code will be executed
        int a = 5, b = 4;
        do {
            System.out.println("This conditon is False but still print it one Times");
        } while (a < b);
    }

    public static void doWhileLoop2() {
        int i = 0;
        do {
            System.out.println("I value is: " + i);
            i++;
        } while (i < 5);
    }

    public static void forLoop() {
        for (int i = 0; i < 5; i++) {// Initialization; Condition; Incrementing
            System.out.println("i value is: " + i);
        }
        // Most Commonly used loop
        // Act like while loop but its more simplified
    }
}

// Learning on Arrays

/*Arrays can be categorized into 3 types
 * 		a. Single dimensional array
 * 		b. Two dimensional array
 * 		c. Three dimensional array
 */

package CoreJava.arraysMethodVariables;

public class SingleDimensionArrays {

    public static void main(String[] args) {
        //singleDimensionArray1();
        //singleDimensionArray2();
        //singleDimensionArray3();
        //singleDimensionArray4();
        //singleDimensionArrayForEachLoop1();
        //singleDimensionArrayForEachLoop2();


    }


    /* Single Dimensional Array
     * 		i.	 How to Declare : int a[] or int[] a {Both are correct}
     * 		ii.	 How to create	: new int [Number of Partition]
     * 		iii. How to Assign	: a[0]= 9 here zero is the first index and 9 is the value
     * 		iv:	 How to access 	: System.out.println(a[0])
     */
    public static void singleDimensionArray1() {
        int a[] = new int[3]; // Declaration and Creation

        // Assigning the values to array element
        a[0] = 9;
        a[1] = 5;
        a[2] = 7;

        // Accessing the array elements
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }


    // Alternate way {Preffered}
    public static void singleDimensionArray2() {
        int[] a = new int[2];
        a[0] = 5;
        a[1] = 10;

        System.out.println(a[0]);
        System.out.println(a[1]);

        System.out.println("the Size of the array is " + a.length);
    }


    //Alternate way {Shortcut way}
    public static void singleDimensionArray3() {
        String[] Name = {"Rocky", "Dilon", "Elizabeth"}; // Declare, create and assign all at same step
        System.out.println(Name[0]);
        System.out.println(Name[1]);
        System.out.println(Name[2]);
        System.out.println("The length of the array is " + Name.length);
    }


    //Using For Loop can makes easy to write print statement of array element
    public static void singleDimensionArray4() {
        String[] Name = {"Niloy", "Alomgir", "Rofiq", "Shofiq", "Borkot", "Salam", "Bobita", "Shabnoor", "Kobori", "Rajjak", "Suhel Rana", "Rubel", "Masud Rana", "Salman Shah", "Shakib Kahn", "Zahed Khan", "Bishu Nath", "Anik Sen", "Basharul Chowdhury",};

        for (int i = 0; i < Name.length; i++) {
            System.out.println("Followin Name are Stored in Array Element: " + Name[i]);
        }

    }


    // For Array we can use For Loop or For-Each Loop [Preferred]
    //Demonstration of Array using For-each Loop
    public static void singleDimensionArrayForEachLoop1() {
        int[] a = {3, 5, 1, 6, 2, 8, 7, 9};
        for (int j : a) {
            System.out.println(j);
        }

    }

    public static void singleDimensionArrayForEachLoop2() {
        String[] FoodName = {"Tea", "Biscuite", "Soda", "Cake", "Paratha"};
        for (String k : FoodName) {
            System.out.println(k);
        }
    } // For-each loop designed for Array so easier to use than for loop where you need to express extra logic


    /*ArrayIndexOutOfBoundException
     * 		its an error when you defined maximum size of array 3
     * 		but want to assign extra value at index 4 which never existed.
     */
}

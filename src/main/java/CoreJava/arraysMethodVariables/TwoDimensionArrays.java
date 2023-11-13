// Learning on Two Dimensional Array

package CoreJava.arraysMethodVariables;

public class TwoDimensionArrays {

    public static void main(String[] args) {
        twoDimensionArray1();
        twoDimensionArray2();
        twoDimensionArray3();

    }

    public static void twoDimensionArray1() {
        int[][] a = new int[2][3];
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[0].length; col++) {
                System.out.println(a[row][col]);
            }
        }
    }


    public static void twoDimensionArray2() {
        int[][] b = {{1, 2, 3}, {4, 5, 6}};

        for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < b[1].length; col++) {
                System.out.println("Values are: " + b[row][col]);
            }
        }
    }

    public static void twoDimensionArray3() {
        String[][] Name = {{"Anthony", "Bashar", "Charlie"}, {"Danny", "Elizabeth", "Fabian"}};

        for (int row = 0; row < Name.length; row++) {
            for (int col = 0; col < Name[1].length; col++) {
                System.out.println("Names are " + Name[row][col]);
            }
        }
    }

}

/* Disadvantage of Array
 * 	* Arrays are fixed in Size
 * 		* Solution to this problem
 * 				* Collection Framework - ArrayList
 * 	* Can't Store Multiple data Types in a single array
 * 		* Solution to this problem
 * 				*Use ObjectArray
 */

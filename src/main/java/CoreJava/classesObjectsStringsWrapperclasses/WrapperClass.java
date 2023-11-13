/*Primitive data type	---->	Wrapper Class
 * 		int			---->	Integer [As it is class name so start with capital later]
 *		short		---->	Short
 * 		long		---->	Long
 * 		byte		---->	Byte
 * 		float		---->	Float
 * 		double		---->	Double
 * 		boolean		---->	Boolean
 * 		char		---->	Character
 */


package CoreJava.classesObjectsStringsWrapperclasses;

public class WrapperClass {

    public static void main(String[] args) {
        intWrapperClass();
        charWrapperClass();
        newWrapperClass();
        stringWrapperClass1();
        stringWrapperClass2();
        booleanWrapperClass();
        doubleWrapperClass();

    }

    public static void intWrapperClass() {
        int a = 5;
        Integer aObj = a;
        System.out.println(aObj);
    }

    public static void charWrapperClass() {
        char b = '@';
        Character bObj = b;
        System.out.println(bObj);
    }

    public static void newWrapperClass() {
        Character c = new Character('#');
        // This method is deprecated from Version 9.
        //Instead use the below line:
        Character d = '#';
        System.out.println(d);
    }

    public static void stringWrapperClass1() {
        String e = "100";
        System.out.println(e + 15 + " : Wrong Value"); // give the value of 10015. because its not integer value.

        //To get the Integer value Convert it to WrapperClass Integer
        int e1 = Integer.parseInt(e);
        System.out.println(e1 + 15 + " : Right Value"); // Give value of 115
    }

    public static void stringWrapperClass2() {
        String f = "120ABC";
        String f1 = f.substring(0, 3);
        int f2 = Integer.parseInt(f1);
        System.out.println(f2 + 30);
    }

    public static void booleanWrapperClass() {
        String g = "True";
        boolean g1 = Boolean.parseBoolean(g);
        System.out.println(!g1); // Not True means False
    }

    public static void doubleWrapperClass() {
        String h = "123.45";
        double h1 = Double.parseDouble(h);
        System.out.println(h1 + 7);
    }
}

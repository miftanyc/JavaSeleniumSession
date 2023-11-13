package CoreJava.exceptionHandling;

public class TryCatchBlockExceptionHandling {

    public static void main(String[] args) {

        // Code written before exception
        System.out.println("This line is written BEFORE exception \n");


        // ⚠️ UNCHECKED Exception Written and Handled here using Try Catch Block
        try {
            int a = 10 / 0;
            System.out.println("Valu of a is : inifinite " + a);
        } catch (Exception e) {
            System.out.println("Exception Handled using Try Catch Block");
            System.out.println(e); // Give name of exception
            System.out.println(e.getMessage()); // Give reason for exception
            e.printStackTrace(); // Gives more detail about exception
        }


        //Code written after the exception
        System.out.println("\n This line is written AFTER exception");
    }
}

	/*-------------------------------------------------------------
 ⏹️	Exception Hierarchy
	 ☑️ Arrithmetic Exception ➡️ RuntimeException ➡️ Exception ➡️ Throwable ➡️ Object
	 
	 
	 🔶 Object is The parent Class of All Class.
	 --------------------------------------------------------------*/
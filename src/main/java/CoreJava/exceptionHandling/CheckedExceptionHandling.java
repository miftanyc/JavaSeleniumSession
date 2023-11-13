// Learning Checked Exception

package CoreJava.exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionHandling {

    public static void main(String[] args) {
        // Representing a file That Exist
        File file = new File("Documents\\Test File Handling.txt");

        // Read this File
        try {
            FileReader fr = new FileReader(file); // Compiler guessing you may not have this file so its urging you create try catch block
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
        }

        System.out.println("End of Program");
    }


}

	/*---------------------------------------------------
	🔶 Exception are Two Type
	 	⏹️ Checked Exception
	 		☑️ When Compiler guess there migh be an exception and warned you.
	 	
	 	⏹️ Unchecked Exception
	 		☑️ Compiler doesnt have any idea of error until you run it
	
	-----------------------------------------------------------*/
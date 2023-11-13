package CoreJava.exceptionHandling;

public class ExceptionDemoOne {

    public static void main(String[] args) {

        // Code written before exception
        System.out.println("This line is written BEFORE exception \n");


        // Exception Written here
        int a = 10 / 0;

        //Code written after the exception
        System.out.println("This line is written AFTER exception");
    }

}


/*------------------------------------------------
 
 	i.	Program will Execute any code written before the exception 
 	ii.	Any code written after the exception will not excute
 	
 	iii. To solve this problem we will use "Execption Handling"
 				a) try catch Block
 
 ------------------------------------------------*/
package practiceDemonstration;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DemoClass {

    public static void main(String[] args) {
        logicLayer();
    }

    public static void logicLayer() {
    //count sum of digit
        int digit = 12345678;
        int sum = 0;

        while(digit!=0){
            int residual = digit % 10;
            digit = digit/10;
            sum = sum+residual;
        }

        System.out.println(sum);


    }


}
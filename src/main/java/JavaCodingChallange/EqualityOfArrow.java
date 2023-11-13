package JavaCodingChallange;

import java.util.Arrays;

public class EqualityOfArrow {

    static int[] a = {1,2,3,4,5};
    static int[] b = {1,2,3,4,5};

    public static void main(String[] args) {

        //arrowEquality1();
        arrowEquality2();
    }
    //Approach 1:
    public static void arrowEquality1(){
        boolean status = Arrays.equals(a, b);
        if (Arrays.equals(a, b)){
            System.out.println("Arrows are equal");
        }else{
            System.out.println("Arrows are not equal");
        }
    }

    //Approach 2
    public static void arrowEquality2(){
        boolean status = true;
        if(a.length==b.length){
            for(int i=0; i<a.length; i++){
                if(a[i]!=b[i]){
                    status=false;
                    break;
                }
            }
        }
        if(status==true){
            System.out.println("Arrows are equal");
        }else{
            System.out.println("Arrows are not equal");
        }
    }
}

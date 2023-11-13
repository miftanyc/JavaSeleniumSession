package JavaCodingChallange;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SortingElementInArray {

    public static void main(String[] args) {
        sortElement();
        sortArray();

    }

    public static void sortElement(){

        int[] a = {4,3,1,5,2};
        for(int i=0; i<a.length; i++){
            for(int n=1; n<a.length; n++){
                for(int j=i+1; j<a.length; j++){
                    if(a[i]>a[j]){
                        int temp = a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }

            }

        }
        System.out.println("Arrow In sequence:");
        for(int k:a){
            System.out.print(" >>  "+k);
        }
        System.out.println();
    }

    public static void sortArray(){
        int[] a = {4,3,1,5,2};
        System.out.println("Unsorted Arrow: "+ Arrays.toString(a));

        //Now do Sorting
        Arrays.parallelSort(a);
        System.out.println("Sorted Arrow: "+Arrays.toString(a));

    }
}

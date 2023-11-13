package JavaCodingChallange;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateElementInArray {

    public static void main(String[] args) {

        dupElementInArray();
        dupElementFinding();
    }

    public static void dupElementInArray(){
        int[] a = {1,2,3,3,4,5,5,6};

        HashSet<Integer> hs = new HashSet();

        for(int i=0; i<a.length; i++){
            hs.add(Integer.valueOf(a[i]));
        }

        System.out.println("Values of element without duplication: "+hs);


    }

    public static void dupElementFinding(){
        int[] a = {1,2,3,3,4,5,5,6};
        ArrayList<Integer> dup = new ArrayList<>();

        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    dup.add(i);
                }
            }
        }
        System.out.println("Duplicate Arrow Element: "+dup);

    }


}

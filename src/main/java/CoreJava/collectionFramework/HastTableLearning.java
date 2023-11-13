package CoreJava.collectionFramework;

import java.util.*;

public class HastTableLearning {

    public static void main(String[] args) {

        Hashtable<Integer, String> data = new Hashtable();
        data.put(1, "Mifta");
        data.put(2, "Nicola");
        data.put(3, "Alishba");

        //Using Enumerator
        Enumeration<String> enu = data.elements();
        System.out.println("Print value using Enumerator elements, hasMoreElements, nextElements");
        while(enu.hasMoreElements()){
            System.out.println(enu.nextElement());
        }

        System.out.println("Print value using EntrySet");
        Set<Map.Entry<Integer, String>> setdata = data.entrySet();
        System.out.println(setdata);

        System.out.println("Print value using iterator");
        Iterator<Map.Entry<Integer, String>> dataItr = data.entrySet().iterator();
        while(dataItr.hasNext()){
            System.out.println(dataItr.next());
        }





    }
}

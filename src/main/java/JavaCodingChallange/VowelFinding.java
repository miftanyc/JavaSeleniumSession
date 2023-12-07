package JavaCodingChallange;

import java.util.HashMap;

public class VowelFinding {

    public static void main(String[] args) {
        findingVowelUsingMatcher();
        findingVowelUsingRegularLogic();
        findingVowelApproach3();

    }

    public static void findingVowelUsingMatcher(){
        //Find which vowels are present and how many times?
        String str = "the quick brown fox jump over the lazy dog";

        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String s = String.valueOf(c);
            if(s.matches("[aeiou]")){
                if(hm.containsKey(s)){
                    Integer count = hm.get(s);
                    count++;
                    hm.replace(s, count);

                }else{
                    hm.put(s, 1);
                }
            }
        }

        System.out.println("Approach 1 >>>>>>>>>>>>>>>>>>>>>>");

        for(String k: hm.keySet()){
            Integer val = hm.get(k);
            System.out.print(k.toUpperCase()  +  val);
        }

    }


    public static void findingVowelUsingRegularLogic(){

        //Find which vowels are present and how many times?
        String str = "the quick brown fox jump over the lazy dog";

        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String s = String.valueOf(c).toLowerCase();
            if(s.contains("a")||s.contains("e")||s.contains("i")||s.contains("o")||s.contains("u")){
                if(hm.containsKey(s)){
                    Integer count = hm.get(s);
                    count++;
                    hm.replace(s, count);

                }else{
                    hm.put(s, 1);
                }

            }
        }

        System.out.println();
        System.out.println("Approach 2 >>>>>>>>>>>>>>>>>>>>>>");

        for(String k: hm.keySet()){
            Integer val = hm.get(k);
            System.out.print(k.toUpperCase()  +  val);
        }

    }


    public static void findingVowelApproach3(){
        String str = "the quick brown fox jump over the lazy dog";

        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String s = String.valueOf(c).toLowerCase();
            if("aeiou".contains(s)){
                if(hm.containsKey(s)){
                    Integer count = hm.get(s);
                    count++;
                    hm.replace(s, count);

                }else{
                    hm.put(s, 1);
                }

            }
        }

        System.out.println();
        System.out.println("Approach 3 >>>>>>>>>>>>>>>>>>>>>>");

        for(String k: hm.keySet()){
            Integer val = hm.get(k);
            System.out.print(k.toUpperCase()  +  val);
        }

    }

}

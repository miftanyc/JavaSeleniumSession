package JavaCodingChallange;

import java.util.HashMap;

public class StringCharacterOccuranceFinding {

    public static void main(String[] args) {

        String para = "dedatdegedanqe";
        //String para = "This is Nilanjona";
        HashMap<String, Integer> hm = new HashMap<>();  //String key Integer value

        for (int i = 0; i < para.length(); i++) {
            char c = para.charAt(i);
            String s = String.valueOf(c);
            if (hm.containsKey(s)) {
                Integer count = hm.get(s);
                count++;
                hm.replace(s, count);

            } else {
                hm.put(s, 1);
            }

        }
        for (String k: hm.keySet()) {
            Integer val = hm.get(k);
            System.out.println(k+"    |     "+val);
        }

    }
}

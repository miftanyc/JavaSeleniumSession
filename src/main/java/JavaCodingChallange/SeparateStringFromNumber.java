package JavaCodingChallange;


public class SeparateStringFromNumber {

    //Separate String value with Upper and Lower Case from Number
    public static void main(String[] args) {
        String word= "DSes125B@F5Ew";
        StringBuilder upperCase= new StringBuilder();
        StringBuilder lowerCase = new StringBuilder();
        StringBuilder number= new StringBuilder();
        StringBuilder specialChar = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(c>=65 && c<=90){ //Identify A-Z UpperCase
                upperCase.append(c);

            }else if(c>=97 && c<=122){//Identify a-z LowerCase
                lowerCase.append(c);

            }else if(c>=48 && c<=57){ //Identify 0-9 Number
                number.append(c);

            }else{ //All Others Special Characters
                specialChar.append(c);
            }
        }

        System.out.println("===========================================");

        //Print Out the Seperated Character
        System.out.println("Upper Case Letter: "+ upperCase);
        System.out.println("Lower Case Letter: "+lowerCase);
        System.out.println("Numbers: "+number);
        System.out.println("Special Character: "+specialChar);

        System.out.println("==========================================");

        //Print out The Length of Each Type
        System.out.println("Upper Case Letter Length: "+ upperCase.length());
        System.out.println("Lower Case Letter Length: "+lowerCase.length());
        System.out.println("Numbers Length: "+number.length());
        System.out.println("Special Character Length: "+specialChar.length());

    }
}

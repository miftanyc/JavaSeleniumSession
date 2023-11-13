package JavaCodingChallange;

public class MissingNumberInArrayElement {

    public static void main(String[] args) {
        findingMissingNumberInArray();

    }
    public static void findingMissingNumberInArray(){

        int[] a = {1,2,3,5};
        int sum1 = 0;
        int sum2 = 0;
        int totalElementLength = a.length + 1;

        //Find the sum of all element
        for(int i=0; i<a.length; i++){
            sum1 = sum1+a[i];
        }
        //FIND THE SUM OF ELEMENT IN SEQUENCE
        for(int j=1; j<= totalElementLength; j++){
            sum2 = sum2+j;
        }

        //Find the missing number by subtraction
        int missingNumber= sum2-sum1;
        System.out.println("Missing number is : "+ missingNumber);

    }
}

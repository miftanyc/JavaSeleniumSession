package JavaCodingChallange;

public class MaximumAndMinimumElementInArray {

    static int[] a = {5,3,6,9,2};

    public static void main(String[] args) {
        System.out.println("Maximum Number in array is: "+maximumNumberInArray());
        System.out.println("Minimum Number in array is: "+minimumNumberInArray());

    }

    public static int maximumNumberInArray(){
        int max=0;
        for(int i=0; i<a.length; i++){
            int num = a[i];
            if(max<num){
                max=num;
            }
        }

        return max;
    }

    public static int minimumNumberInArray(){
        int min = maximumNumberInArray();
        for(int i=0; i<a.length; i++){
            int num = a[i];
            if(min>num){
                min=num;
            }
        }
        return min;
    }
}

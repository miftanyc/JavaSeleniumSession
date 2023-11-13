package JavaCodingChallange;

public class SumOfElementInAArray {

    public static void main(String[] args) {
        int [] a = {2,4,5,6,3,5,6,7,8};
        int sum=0;


        for(int i=0; i<a.length; i++){
            int element = a[i];
            sum = sum+ element;
        }
        System.out.println(sum);
    }
}

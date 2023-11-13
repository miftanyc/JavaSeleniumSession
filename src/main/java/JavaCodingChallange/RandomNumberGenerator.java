package JavaCodingChallange;


import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class RandomNumberGenerator {

    public static void main(String[] args) {

        //Approach 1
        Random random = new Random();
        int randomNumber = random.nextInt(20);
        System.out.println("Approach 1 Random Number: "+randomNumber);

        double randomDouble = random.nextDouble();
        System.out.println("Approach 1 Random Double Value "+randomDouble);


        //Approach 2
        System.out.println("Math Class Approach "+Math.random());

        //Approach 3: Apache Commons Lang3 repository
        String randomNumberApache = RandomStringUtils.randomNumeric(10);
        int ranNum = Integer.parseInt(randomNumberApache);
        System.out.println("Random Number using Apache Commons Lang "+ ranNum);

        String randomstring = RandomStringUtils.randomAlphabetic(7);
        System.out.println("Random String Using Apache Common lang: "+ randomstring);

    }
}

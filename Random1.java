//35. Java Program to Check Whether the Generated Random Number Is Even or Odd

import java.util.Random;

public class Random1 {
    public static void main(String []args){
        
        int min = 1;
        int max = 100;

        //generating a random number

        Random1 r = new Random1();
        int randomNo;
        randomNo = min + r.nextInt(max);
        System.out.println("Generated random number is : "+randomNo);

        //checking wether the no is odd or even

        if(randomNo %2==0){
            System.out.println("The generated random number is even.");
        }
        else{
            System.out.println("The generated random number is odd.");
        }
        
    }

    private int nextInt(int max) {
        return 0;
    }


    
}

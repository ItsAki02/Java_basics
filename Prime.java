// Java program to generate the prime numbers from 1 to N

import java.util.Scanner;

public class Prime {
    public  static void main(String []args){
        System.out.println("Enter the range: ");
    try(Scanner sc = new Scanner(System.in)){
    int number =Integer.parseInt(sc.nextLine());

    for (int num = 2; num <= number; num++)
        {
            boolean isPrime = true;
            for (int i=2; i <= num/2; i++)
            {
                if ( num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
 
            if ( isPrime == true )
                System.out.println(num);
        }
        
    }
}
    
}

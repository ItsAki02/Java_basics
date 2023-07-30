//Java program to display the given integer in the reverse order

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("Enter an integer: ");
            int n=Integer.parseInt(sc.nextLine());
            int rev=0;
            while(n!=0){
                int digit= n%10;
                rev=(rev * 10)+digit;
                n = n / 10;
            }
            System.out.println(rev);
        }
    }
    
}

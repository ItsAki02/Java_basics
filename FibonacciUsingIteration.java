//Java program to print Fibonacci series using iteration

import java.util.Scanner;

public class FibonacciUsingIteration {
    public static void main(String []args){
        int n1=0,n2=1;
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the number of terms in the sequence: ");
            int count=sc.nextInt();
            int n3,i;
            System.out.print(n1+ " "+n2);
            for(i=2;i<count;++i){
                n3=n1+n2;
                System.out.print(" "+n3);
                n1=n2;
                n2=n3;
            }
        }
    }
    
}

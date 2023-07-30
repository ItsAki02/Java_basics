//31. Java program to find the Nth term in a Fibonacci series using recursion

import java.util.Scanner;

public class Fibonacci {
    public static void main(String []args){
        try(Scanner sc=new Scanner(System.in)){
            int n;
            System.out.print("Enter  the position(N): ");
            n=sc.nextInt();
            System.out.println("Nth Fibonacci no. is: "+NthFibonacciNo(n));
        }

    }
    static int NthFibonacciNo(int n){
        if(n==1)
        return 0;
        else if(n==2)
        return 1;
        else 
        return NthFibonacciNo(n-1)+ NthFibonacciNo(n-2);

    }

    
}

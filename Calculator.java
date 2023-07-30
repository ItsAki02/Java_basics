//Java program to implement a calculator to do basic operations

import java.util.Scanner;

public class Calculator{
    public static void main(String []args){
        int a,b,sum,sub,multi;
        double div;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1st no.:");
            a=sc.nextInt();
            System.out.println("Enter 2nd no.:");
            b=sc.nextInt();
            while(true){
                System.out.println("Enter 1 for Addition");
                System.out.println("Enter 2 for Subtraction");
                System.out.println("Enter 3 for Multiplication");
                System.out.println("Enter 4 for Division");
                System.out.println("Enter 5 for Exit");
                int option=sc.nextInt();
                switch(option){
                    case 1:
                    sum= a + b;
                    System.out.println("Result:" +sum);
                    break;
                    case 2:
                    sub= a - b;
                    System.out.println("Result:" +sub);
                    break;
                    case 3:
                    multi = a * b;
                    System.out.println("Result:" +multi);
                    break;
                    case 4: 
                    div = (double)a/b;
                    System.out.println("Result:" +div);
                    break;
                    case 5:
                    System.exit(0);
                }
            }
        }

        
    }
}
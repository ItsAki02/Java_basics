//Java program to check whether a string is a palindrome or not

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            String a, b = "";
            System.out.println("Enter the String that you want to check: ");
            a=sc.nextLine();
            int n = a.length();
            for(int i = n-1; i >= 0; i--){
                b = b + a.charAt(i);
            }
            if(a.equalsIgnoreCase(b)){
                System.out.println("The string is a palindrome.");
            
            }
            else{
                System.out.println("The string is not palindrome.");
            }

        }
    }
    
}

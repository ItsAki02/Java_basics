import java.util.Scanner;
public class Even{
    public static void main(String []args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int a=sc.nextInt();
            if(a%2==0){
                System.out.println("Even no");
            }
                else {
                    System.out.println("Odd No.");
                }
        }
        
    }
}
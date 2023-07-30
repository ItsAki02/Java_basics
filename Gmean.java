//11. Java program to find the geometric mean of n numbers

import java.util.Scanner;

public class Gmean {
    public static void main(String[] args){
        int c=0;
        double p =1.0;
       try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the no of values: ");
        int count= Integer.parseInt(sc.nextLine());
        while((c<count)){
            System.out.println("enter a real no.: ");
            double x = Double.parseDouble(sc.nextLine());
            c= c+1;
            p = p*x;
        }
        double gm=Math.pow(p,1.0/count);
        System.out.println("The geometric mean is: "+gm);
   
    


    }
    
    }
}

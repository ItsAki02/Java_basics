// Java Program to Find Your Weight on Mars

import java.util.Scanner;

public class WeightOnMars {
    public static void main(String []args){
        try(Scanner sc=new Scanner(System.in)){
           System.out.println("Enter your weight(in lbs): ");
           
           float weight=sc.nextFloat();
            double weightOnMars= (weight*.38);
           
            System.out.println("your weight is" +String.format("%.4f",weightOnMars)+ "lbs on Mars");
           
            System.out.println("Converting the variable into integer");
            int weightonMarsInt=(int)weightOnMars;
            System.out.println(weightonMarsInt);
            
            System.out.println("Converting the variable into char");
            char weightOnMarsChar=(char)weightOnMars;
            System.out.println(weightOnMarsChar);
           
            System.out.println("Converting the variable into Int and doing operation on it");
            int newIntVariable=weightOnMarsChar*2;
            System.out.println(newIntVariable);

        }   
     }
    
}

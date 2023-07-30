// Calculate BMI Using Java

import java.util.Scanner;

public class Bmi {
    public static void main(String []args){
        float height,weight,bmi;
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the height(in inches): ");
            height = sc.nextFloat();
            System.out.println("Enter the weight(in pounds): ");
            weight = sc.nextFloat();
            bmi = (float)(weight / Math.pow(height, 2) * 703);

            System.out.println("The BMI is: "+bmi);

            if(bmi<16.00)
            System.out.println("Starvation");
            else if(bmi>=16.00 && bmi <= 16.99)
            System.out.println("Emaciation");
            else if(bmi>=17.00 && bmi<=18.49)
            System.out.println("Underweight");
            else if(bmi>=18.50 && bmi<=22.99)
            System.out.println("Normal,low range");
            else if(bmi>=23.00 && bmi<=24.99)
            System.out.println("Normal,high range");
            else if(bmi>=25.00 && bmi<=27.49)
            System.out.println("Overweight,low range");
            else if(bmi>=27.50 && bmi<=27.99)
            System.out.println("Overweight,high range");
            else if(bmi>=30.00 && bmi<=34.9)
            System.out.println("1st degree obesity");
            else if(bmi>=35.00 && bmi<=39.90)
            System.out.println("2nd degree obesity");
            else 
            System.out.println("3rd degree obesity");

        }
    }
    
}

//Java program to check leap year

import java.util.Scanner;



public class LeapYr {
    public static void main(String []args){
       try( Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the year you want to check");
        int year=Integer.parseInt(sc.nextLine());
        boolean leap=false;
        if(year % 4 == 0){
            //if the year is a century
            if(year % 100 == 0){
                if(year % 400 == 0){
                    leap=true;
                    
                }
                else 
                leap=false;
            }
        //if the year is not a century
        else leap = true;

        }
        else 
        leap = false;
        if(leap){
        System.out.println(year + " is a leap year");
        }
        else
        System.out.println(year + " is not a leap year");
    }
    
}
}

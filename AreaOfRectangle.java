//Write a program that follows the rules of object-oriented programming and will calculate the area of the rectangle.

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String []args){
        RectangleArea r = new RectangleArea();
        r.getData();
        r.computeField();
        r.fieldDisplay();

    }
    
}
class RectangleArea{
    public double length,width,area;

    public void getData(){
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("Enter the length of the rectangle: ");
            length = sc.nextDouble();
            System.out.println("Enter the width of the rectangle: ");
            width = sc.nextDouble();
        }
    }
    public void computeField(){
        area = length * width;
    }
    public void fieldDisplay(){
        System.out.println("The area of the rectangle is: "+area);
    }
}

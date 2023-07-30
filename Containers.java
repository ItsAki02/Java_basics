//35. Java Program to Check Whether the Generated Random Number Is Even or Odd

import java.util.Scanner;

public class Containers {
    public static void main(String []args){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("How many Lego  bricks do we have? Choose an odd number between 50 and 100: ");
            int amtOfBricks = Integer.parseInt(sc.nextLine());

            System.out.println("How many Lego blocks fit in one container? Choose an even no between 5 and 10: ");
            int containerCapicity= Integer.parseInt(sc.nextLine());

            int noOfFullContainers = amtOfBricks/containerCapicity;
            int NoOfTotalContainers;

            int noOfBlocksInnotFullContainers = amtOfBricks % containerCapicity;

            if(noOfBlocksInnotFullContainers != 0){
                NoOfTotalContainers = noOfFullContainers + 1;
            }
            else{
                NoOfTotalContainers = noOfFullContainers;
            }
             System.out.println("No of full containers we have: "+noOfFullContainers);
             System.out.println("No of total containers we have: "+NoOfTotalContainers);
             System.out.println("No of blocks in the container that is not completely full: "+noOfBlocksInnotFullContainers);

        }
    }

    
}

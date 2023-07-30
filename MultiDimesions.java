import java.util.*;

public class MultiDimesions {
    public static void main(String []args){
      
      Scanner sc=new Scanner(System.in);
        //  int[][] arr= new int[]3[5];

    /*  int[][] arr =new  int[3][];
      int[][] arr2D = {
                    {1,2,3},//0th index
                    {4,5},//1st index
                    {6,7,8,9}};//2nd index */

                    int[][] arr= new int[3][2];

                    //input
                    for(int row=0;row<arr.length;row++){
                        //for each col in every row
                        for(int col=0;col<arr[row].length;col++){
                            arr[row][col]=sc.nextInt();
                        }
                    }
      }



    }
    


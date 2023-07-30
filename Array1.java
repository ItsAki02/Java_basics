import java.util.Arrays;
import java.util.Scanner;
public class Array1 {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        //array declaration
        int [] arr;
        arr=new int[5];  //space allocation

        //array declaration
        /*  arr[0]=10;
        arr[1]=20;
         arr[2]=30;
        arr[3]=40;
        arr[4]=40; 

        //accessing elements in the array
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
        for(int num:arr){
            System.out.print(num+ " ");
        }
        System.out.println(Arrays.toString(arr));*/
        
        //array of objects
        String[] str = new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));

        //modify

        str[1]="Akanksha";

        System.out.println(Arrays.toString(str));



 


    }
    
}

//Write a program that sums even numbers from 1 to 100 using for loop.


public class SumOfEven {
    public static void main(String []args){
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println("The sum of even numbers from 1-100 is: "+sum);
    }
    
}

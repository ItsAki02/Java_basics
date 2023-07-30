//Java program to display all integers within the range 100-150 whose sum of digits is an even number


public class RangeAndSum {
    public static void main(String []args){
    for(int i=100; i<150;i++){
        int num=i;
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        if(sum%2==0){
            System.out.println(i);
        }
    }
    
}
}

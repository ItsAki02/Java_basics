import java.util.*;

public class ArrayOperations {
   // public static void main(String []args){
    //     //minimum operation
    //     Integer[] arr={1,2,3,4,5};
    //     int min=Collections.min(Arrays.asList(arr));
    //     System.out.println(min);

    //     //maximum operation
    //     String[] arr1={"AA","AB","AC","BC"};
    //     String max=Collections.max(Arrays.asList(arr1));
    //     System.out.println(max);

    // }
    
     //sum of max and min
    //  public static int sumOfminAndmax(int[] arr,int n){
    //     Integer[] narr=new Integer[n];
    //     for(int i=0;i<n;i++){
    //         narr[i]=Integer.valueOf(arr[i]);

    //     }
    //     int min=Collections.min(Arrays.asList(narr));
    //     int max=Collections.max(Arrays.asList(narr));
    //     int sum=min+max;
    //     return sum;
    //  }
     
   // sorted arrays
    // String[] arr={"Akanksha","Pallavi","Ishika"};
    // Arrays.sort(arr,Collections.reverseOrder());
    // for(int i=0;i<3;i++){
    //     System.out.println(arr[i]);
    // }
    
    // int[] arr1={10,5,7,3,8,0};
    // Arrays.sort(arr1,0,6);
    // for(int i=0;i<6;i++){
    //     System.out.println(arr1[i]);
    // }

    //reverse operation
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    // Integer[] arr=new Integer[n];
    // for(int i=0;i<n;i++){
    //     arr[i]=sc.nextInt();
    // }
    // Collections.reverse(Arrays.asList(arr));
    // for(int i=0;i<n;i++){
    //     System.out.println(arr[i]+" ");
    // }
    //reverse words in string
    public static String reverseString(String str){
    List<String> s=new ArrayList<String>();
    String t="";
    for(int i=0;i<=str.length();i++){
        if(i==str.length()){
            if(t!=""){
                s.add(t);
            }
        }
        else{
            if(str.charAt(i)==' '){
                if(t!=""){
                    s.add(t);
                    t="";
                }
            }
            else{
                t+=str.charAt(i);
            }
        }
    }
    Collections.reverse(s);
    String ans="";
    for(int i=0;i<s.size();i++){
        ans+=s.get(i);
        ans+=" ";
    }


    }
}


//}


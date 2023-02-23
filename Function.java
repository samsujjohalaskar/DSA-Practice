import java.util.*;

public class Function {
    // public static int sum(int a, int b){
    // int sum = a+b;
    // System.out.println(sum);
    // return 1;
    // }
    // public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);
    // int a=sc.nextInt();
    // int b=sc.nextInt();
    // sum(a,b);
    // }


    // public static int Average(int a, int b, int c){ 
    //     int avg=(a+b+c)/3;
    //     System.out.println(avg);
    //     return 1;
    // }
    // public static void main(String[] args){
    //     Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();
    //     int c=sc.nextInt();
    //     Average(a, b, c);
    // }    

    public static void sumOfAllOddNumber( int  n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if( i%2 != 0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sumOfAllOddNumber(n);
    }

}

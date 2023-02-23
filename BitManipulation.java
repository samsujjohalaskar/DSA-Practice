import java.util.*;

public class BitManipulation {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int pos=sc.nextInt();
    int operation= sc.nextInt();
    int bitMask=1<<pos;
    int newBM = ~(bitMask);


    if(operation==1){
         
        System.out.println(n | bitMask);
    }
    else{
        System.out.println(n & newBM);
    }

   

    //GET

    // if((n & bitMask)== 0){
    //     System.out.println("zero");
    // }
    // else{
    //     System.out.println("one");
    // }


    //SET

    // int newNumber = n | bitMask;
    // System.out.println(newNumber);



    //CLEAR

    // int newBM= ~(bitMask);
    // System.out.println(newBM & n);





    //UPDATE


}
}

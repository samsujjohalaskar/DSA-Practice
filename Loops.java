import java.util.*;

public class Loops {
    public static void main(String[] args){
        for(int i = 0 ; i <= 10; i ++){
            System.out.print(i);
        if(i ==10){
            System.out.println();
        }
        }
        int j = 0;
        while(j <=10){
            System.out.print(j);
            j++;
        if(j ==11){
            System.out.println();
        }
        }
        int k = 0;
        do {
            System.out.print(k);
            k++;
        }while(k<=10);
        if (k ==11){
            System.out.println();
        }
    }
}

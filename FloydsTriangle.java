import java.util.*;

public class FloydsTriangle {
    public static void main(String[] args) {
        int n = 5;

        // Floyd's Triangle

        int num=1;
        for(int i=1;i<=n;i++){
        for(int j=1;j<=(n-i);j++){
        System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
        System.out.print(num+ " ");
        num++;
        }
        System.out.println();
        }
        
        //lower part

        for(int i=n;i>=1;i--){
        for(int j=1;j<=(n-i);j++){
        System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
        System.out.print(num+ " ");
        num++;
        }
        System.out.println();
        }
        
    }
}

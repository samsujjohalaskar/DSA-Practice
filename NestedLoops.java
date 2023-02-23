import java.util.*;

public class NestedLoops {
    public static void main(String[] args) {

        // Pascal's Triangle

        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
        int coef=1;
        for(int k=rows-i;k>0;k--){
        System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
        System.out.print(coef + " ");
        coef = coef * (i-j)/j;
        }
        System.out.println();
        }

        // Palindrome Number Pyramid

        int n = 5;
        for(int i=1;i<=n;i++){
        for(int j=n-i;j>=0;j--){
        System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
        System.out.print(j);
        }
        for(int j=i-1;j>=1;j--){
        System.out.print(j);
        }
        System.out.println();
        }

        // Palindrome Charecter Pyramid

        int m = 5;
        for(int i=1;i<=m;i++){
        for(int j=m-i;j>=0;j--){
        System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
        System.out.print((char)(j+64));
        }
        for(int j=i-1;j>=1;j--){
        System.out.print((char)(j+64));
        }
        System.out.println();
        }
    }
}

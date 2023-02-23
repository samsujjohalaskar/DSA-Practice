import java.util.Scanner;

public class PascalsTriangle {
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
    }
}

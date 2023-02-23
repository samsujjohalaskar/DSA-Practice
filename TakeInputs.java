import java.util.*;

public class TakeInputs {
    public static void main(String[] args){
        int a ;
        double b;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = obj.nextInt();
        System.out.println("Enter the value of a: ");
        b = obj.nextDouble();
        double sum = a + b;
        double multi = a * b;
        System.out.println("Sum of a and b is: " + sum);
        System.out.println("Multiplication of a and b is: " + multi);
    }
}

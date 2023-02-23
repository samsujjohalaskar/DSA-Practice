import java.util.*;

public class IfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int a = sc.nextInt();
        if (a >  18){
            System.out.println("Congrats! you are an ADULT");
        }
        else if (a == 18){
            System.out.println("Congrats! you are an ADULT");
        }
        else{
            System.out.println("You are still a kid");
        }
    }
}

import java.util.*;

public class SwitchBreak {
    public static void main(String[] args){
        System.out.println("Enter the integer button: ");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button){
            case 1: System.out.println("case 1");
            break;
            case 2: System.out.println("case 2");
            break;
            case 3: System.out.println("case 3");
            break;
            case 4: System.out.println("case 4");
            break;
            case 5: System.out.println("case 5");
            break;
            default: System.out.println("Invalid");
        }

            System.out.println("Enter the string button from a to e: ");
            Scanner scp = new Scanner(System.in);
            char button1 = scp.next().charAt(0);
            switch (button1){
                case 'a': System.out.println("case 1");
                break;
                case 'b': System.out.println("case 2");
                break;
                case 'c': System.out.println("case 3");
                break;
                case 'd': System.out.println("case 4");
                break;
                case 'e': System.out.println("case 5");
                break;
                default: System.out.println("Invalid");    
        }
        System.out.println("Enter the string button : ");
        Scanner scpq = new Scanner(System.in);
        String button2 = scpq.nextLine();
        switch (button2){
            case "open": System.out.println("case 1");
            break;
            case "save": System.out.println("case 2");
            break;
            case "delete": System.out.println("case 3");
            break;
            case "restore": System.out.println("case 4");
            break;
            case "response": System.out.println("case 5");
            break;
            default: System.out.println("Invalid");    
    }
    }
}

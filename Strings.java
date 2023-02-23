import java.io.CharArrayReader;
import java.util.*;

public class Strings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String findstring[] = new String[size];
        for (int i = 0; i < size; i++) {
            // Scanner obj = new Scanner(System.in);
            findstring[i] = sc.next();
        }
        int sum=0;
        for (int i = 0; i < findstring.length; i++) {
            sum += findstring[i].length();
        }
        System.out.println(sum);


        // Scanner sc =new Scanner(System.in);
        // String name =sc.next();
        // System.out.println(name);
        // String a = " ";
        // for(int i=0;i<name.length();i++){
        //     if(name.charAt(i)=='e'){
        //         a += 'i';
        //     }
        //     else{
        //         a+=name.charAt(i);
        //     }
        // }
        // System.out.println(a);
            
        // Scanner sc =new Scanner(System.in);
        // String name =sc.next();
        // System.out.println(name);
        // String usn="";
        // for(int i=0;i<name.length();i++){
        //     if(name.charAt(i)=='@'){
        //         break;
        //     }
        //     else{
        //         usn+=name.charAt(i);
        //     }
        // }
        // System.out.println(usn);
    }
}

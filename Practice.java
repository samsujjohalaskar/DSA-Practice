import java.util.Arrays;

import javax.lang.model.element.Element;

// public class Practice {
//    public static boolean map[]=new boolean[26];
//    public static void removeDuplicates(String str,int idx,String newStr){
//       if(idx==str.length()){
//          strToChar(newStr);
//          return;
//       }
//       char currChar=str.charAt(idx);
//       if(map[currChar-'a']){
//          removeDuplicates(str, idx+1, newStr);
//       }else{
//          newStr+=currChar;
//          map[currChar-'a']=true;
//          removeDuplicates(str, idx+1, newStr);
//       }
//    }
//    public static void strToChar(String str){

//       char ch[]=new char[str.length()];
//       for(int i=0;i<str.length();i++){
//          ch[i]=str.charAt(i);
//       }
//       for(char c:ch){
//          System.out.print(c);
//       }
//       // System.out.println(ch);
//       sortedArray(ch);
//    }
//    public static void sortedArray(char ch[]){
//       Arrays.sort(ch, 0, ch.length);
//       System.out.println(ch);
//    }

//    public static void main(String[] args) {
//       removeDuplicates("cdkslggvdaca", 0, " ");
//    }
// }

// public class Practice {
//     public static void subsequences(String str, int idx, String newStr) {

//         if (idx == str.length()) {
//             System.out.println(newStr);
//             return;
//         }
//         char currChar = str.charAt(idx);

//         // to be
//         subsequences(str, idx + 1, newStr + currChar);

//         // or not to be

//         subsequences(str, idx + 1, newStr);
//     }

//     public static void main(String[] args) {
//         subsequences("abc", 0, " ");
//     }

// }

public class Practice{
    public static void main(String[] args) {
        int [] arr={4,7,1,3,2};
        for(int i=0;i<arr.length;i++){
            int smallest=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
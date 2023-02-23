import java.util.HashSet;

// public class Recursion2 {
//     public static void towerOfHanoi(int n,String src,String helper,String dest){
//         if(n==1){
//             System.out.println("transfer disk "+n+" from "+src+" to "+dest);
//             return;
//         }
//         towerOfHanoi(n-1, src, dest, helper);
//         System.out.println("transfer disk "+n+" from "+src+" to "+dest);
//         towerOfHanoi(n-1, helper, dest, src);
//     }
//     public static void main(String[] args) {
//         int n=2;
//         towerOfHanoi(n, "S", "H", "D");
//     }
// }
///////////////////Reverse String///////////////

// public class Recursion2{
//     public static void printReverse(String str,int idx){
//         if(idx==0){
//             System.out.println(str.charAt(idx));
//         }
//         System.out.println(str.charAt(idx));
//         printReverse(str, idx-1);
//     }
//     public static void main(String[] args) {
//         String str="abcd";
//         printReverse(str, str.length()-1);
//     }
// }
/////////////////////////////Occurance////////////////////

// public class Recursion2{
//     public static int first=-1;
//     public static int last=-1;

//     public static void findOccurancce(String str,int idx,char element){
//         if(idx==str.length()){
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//         char currChar=str.charAt(idx);
//         if(currChar==element){
//             if(first==-1){
//                 first=idx;
//             }
//             else{
//                 last=idx;
//             }
//         }
//         findOccurancce(str, idx+1, element);
//     }

//     public static void main(String[] args) {
//         findOccurancce("macdagfadcammn",0, 'a');
//     }
// }

/////////////////Sorted Array/////////////////////

// public class Recursion2 {
//     public static boolean sortedArray(int arr[], int idx) {
//         if (idx == arr.length - 1) {
//             return true;
//         }
//         if (arr[idx] >= arr[idx + 1]) {
//             return false;
//         }
//         return sortedArray(arr, idx + 1);
//         // sortedArray(arr, idx+1);
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 3, 3, 7 };

//         System.out.println(sortedArray(arr, 0));
//     }
// }

/////////////Move Char////////////

// public class Recursion2 {
//     public static char element = 'x';

//     public static void moveChar(String str, int idx, int count, String newStr) {
//         if (idx == str.length() - 1) {
//             for (int i = 0; i < count; i++) {
//                 newStr += 'x';
//             }
//             System.out.println(newStr);
//         }

//         char currChar = str.charAt(idx);
//         if (currChar == element) {
//             count++;
//             moveChar(str, idx + 1, count, newStr);
//         } else {
//             newStr += currChar;
//             moveChar(str, idx + 1, count, newStr);
//         }
//     }

//     public static void main(String[] args) {
//         moveChar("axbcxxd", 0, 0, "");
//     }
// }

/////////////////Remove Duplicates////////////////////

// public class Recursion2 {

//     public static boolean[] map = new boolean[26];

//     public static void removeDuplicates(String str, int idx,String newStr) {
//         if(idx==str.length()){
//             System.out.println(newStr);
//         }
//         char currChar = str.charAt(idx);
//         if (map[currChar - 'a']) {
//             removeDuplicates(str, idx+1, newStr);
//         }else{
//             newStr+=currChar;
//             map[currChar- 'a']=true;
//             removeDuplicates(str, idx+1, newStr);
//         }
//     }

//     public static void main(String[] args) {
//         removeDuplicates("abbccda", 0, " ");
//     }
// }

////////////////Subsequences/////////////////////

// public class Recursion2{

//     public static void subsequences(String str,int idx,String newStr){

//         if(idx==str.length()){
//             System.out.println(newStr);
//             return;
//         }
//         char currChar=str.charAt(idx);


//         //to be
//         subsequences(str, idx+1, newStr+currChar);

//         //or not to be

//         subsequences(str, idx+1, newStr);
//     }
//     public static void main(String[] args) {
//         subsequences("abc", 0, " ");
//     }
// }

///////////////Unique Subsequences/////////////

// public class Recursion2{

//     public static void subsequences(String str,int idx,String newStr,HashSet<String> set){

//         if(idx==str.length()){
//             if(set.contains(newStr)){
//                 return;
//             }else{
//                 System.out.println(newStr);
//                 set.add(newStr);
//                 return;
//             }
//         }
//         char currChar=str.charAt(idx);


//         //to be
//         subsequences(str, idx+1, newStr+currChar,set);

//         //or not to be

//         subsequences(str, idx+1, newStr,set);
//     }
//     public static void main(String[] args) {
//         HashSet<String> set=new HashSet<>();
//         subsequences("aaa", 0, " ",set);
//     }
// }
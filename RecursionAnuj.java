import java.util.*;

// public class  RecursionAnuj {
//     public static void main(String[] args) {
//         System.out.println(sum(5));
//         System.out.println(power(3,4));
//         System.out.println(path(3, 4));
//     }
//     static int sum(int n){
//         if(n==1){
//             return 1;
//         }
//         return n+sum(n-1);
//     }
//     static int power(int a,int b){
//         if(b==0){
//             return 1;
//         }
//         return a*power(a,b-1);
//     }
//     static int path(int n,int m){
//         if(n==1||m==1){
//             return 1;
//         }
//         return path(n,m-1)+path(m,n-1);
//     }
// }
/////////////////////////////////////////////////////////////////

///////////////advanced//////////////////

// public class RecursionAnuj{
//     public static void main(String[] args) {
//         int a[][]=  {1,2,1,1,0},
//                     {1,2,1,0,0},
//                     {1,1,2,1,0}
//                     {0,1,2,1,1};

//         FloodFill(a,0,0,3,1);
//         System.out.println();            
//     }
//     static FloodFill(int a[][],int r,int c,int toFill,int prevFill){
//         int rows=a.length;
//         int cols=a[0].length;

//         if(r<0||r>=rows||c<0||c>=cols){
//             return;
//         }
//         if(a[r][c]!=prevFill){
//             return;
//         }
//         a[r][c]=toFill;

//         FloodFill(a, r-1, c, toFill,prevFill);            //top
//         FloodFill(a, r, c-1,toFill,prevFill);             //left
//         FloodFill(a,r+1,c,toFill,prevFill);                //bottom
//         FloodFill(a,r,c+1,toFill,prevFill);               //right
//     }
// }




public class RecursionAnuj{
    public static void main(String[] args) {
        
    }
}
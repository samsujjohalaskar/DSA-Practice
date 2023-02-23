import java.util.*;

public class Arrays {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the size of array: ");
    //     int size = sc.nextInt();
    //     int[] marks = new int[size];
    //     for(int i=0;i<size;i++){
    //         System.out.println("Enter the "+(i+1)+"th element: ");
    //         marks[i]=sc.nextInt();
    //     }
    //     System.out.println("Enter the element to search: ");
    //     int x=sc.nextInt();
    //     // marks[0]=97;
    //     // marks[1]=99;
    //     // marks[2]=98;
    //     // System.out.println(marks[0]);
    //     // System.out.println(marks[1]);
    //     // System.out.println(marks[2]);
    //     for(int i=0;i<marks.length;i++){
    //     if(marks[i]==x){
    //         System.out.println("x is found at index: "+ i);
    //     }
        
    //     }
        
    // }

    
    // public static void charecter(int size){
    //     String names[]=new String[size];
    //     for(int i=0;i<size;i++){
    //         System.out.println("Enter the string: ");
    //         Scanner sc=new Scanner(System.in);
    //         names[i]=sc.nextLine();
    //     }
    //     for(int i = 0;i<names.length;i++){
    //         System.out.println(names[i]);
    //     }
    // }
    // public static void main(String[] args) {
    //     System.out.println("Enter the size of the array: ");
    //     Scanner sc = new Scanner(System.in);
    //     int size=sc.nextInt();
    //     charecter(size);
    // }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int nums[]=new int[5];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("min: "+min);
        System.out.println("max: "+max);
    }
}

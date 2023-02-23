import java.util.*;

public class Sorting {

    // // Bubble Sort

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];
    //creating the Array
    for (int i = 0; i < arr.length; i++) {
    arr[i] = sc.nextInt();
    }
    //print the Array
    for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
    }
    //nextLine
    System.out.println(); //time complexity=O(n^2)
    //Bubble Sort
    for (int i = 0; i < arr.length - 1; i++) {
    for (int j = 0; j < arr.length - 1 - i; j++) {
    if (arr[j] > arr[j + 1]) {
    //swapping
    int temp = arr[j];
    arr[j] = arr[j + 1];
    arr[j + 1] = temp;
    }
    }
    }
    //calling the function
    printArray(arr);
    }

    public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
    }
    }
}
    // // Slection Sort

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt();
    // int arr[] = new int[size];
    // // creating the Array
    // for (int i = 0; i < arr.length; i++) {
    // arr[i] = sc.nextInt();

    // }
    // // print the Array
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // // nextLine
    // System.out.println();

    // //Sort

    // for (int i = 0; i < arr.length - 1; i++) {
    // int smallest = i;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[smallest] > arr[j]) {
    // smallest = j; //updating the smallest index
    // }
    // }
    // int temp=arr[smallest];
    // arr[smallest]=arr[i];
    // arr[i]=temp;

    // }
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }

    // }

    // Insertion Sort

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int size = sc.nextInt();
    //     int arr[] = new int[size];
    //     // creating the Array
    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i] = sc.nextInt();

    //     }
    //     // print the Array
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    //     // nextLine
    //     System.out.println();

    //     // Sort
    //     for (int i = 1; i < arr.length; i++) {
    //         int current=arr[i];
    //         int j=i-1;
    //         while(j>=0 && current<arr[j]){
    //             arr[j+1]=arr[j];
    //             j--;
    //         }
    //         arr[j+1]=current;
    //     }
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]);
    //     }
    // }
// }

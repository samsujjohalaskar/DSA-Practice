public class MergeSort {
    public static void merge(int arr[],int l, int mid,int r){
        int nArr[]=new int[r+1];
        int i=l;
        int j=mid+1;
        int k=l;
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                nArr[k]=arr[i];
                i++;
            }else{
                nArr[k]=arr[j];
            }
            k++;
        }
        if(i>mid){
            while(j<=r){
                nArr[k]=arr[j];
                k++;
                j++;
            }
        }else{
            while(i<=mid){
                nArr[k]=arr[i];
                k++;
                i++;
            }
        }
        for(int o=i;o<r;o++){
            arr[k]=nArr[k];
        }
        for(int p=0;p<arr.length;p++){
            System.out.print(arr[i]);
        }
        
    }
    public static void mergeSort(int arr[],int l,int r){
        if(l<r){
            int mid=l+r/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);

        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,4,6,2,4,1,8,7};
        mergeSort(arr, 0, 8);
    }
}

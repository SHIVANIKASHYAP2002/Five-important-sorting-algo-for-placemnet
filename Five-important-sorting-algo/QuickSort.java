import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before Sorting\n");
        displayArray(arr,n);
        quicksort(arr,0,n-1);
        System.out.println("ArrayAfter soting\n");
        displayArray(arr, n);

    }
    static void displayArray(int[] arr,int n){
       
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
    static void quicksort(int[]arr,int l,int h){
        if(l<h){
            int pix=partition(arr,l,h);
            quicksort(arr, l, pix-1);
            quicksort(arr, pix+1, h);

        }
    }
    static int partition(int[] arr,int l,int h){
       int pivot=arr[h];
       int i=l-1;
       for(int j=l;j<h;j++){
        if(arr[j]<pivot){
            i++;
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
        
       }
       i++;
       int temp=arr[i];
       arr[i]=arr[h];
       arr[h]=temp;
        return i;
    }
}

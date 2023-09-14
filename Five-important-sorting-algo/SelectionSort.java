import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before Sorting\n");
        displayArray(arr,n);
        selectionSort(arr,n);
        System.out.println("ArrayAfter soting\n");
        displayArray(arr, n);

    }
    static void displayArray(int[] arr,int n){
       
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
    static void selectionSort(int[] arr,int n){
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
}

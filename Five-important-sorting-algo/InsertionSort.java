import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before Sorting\n");
        displayArray(arr,n);
        insertionsort(arr, n);
        System.out.println("ArrayAfter soting\n");
        displayArray(arr, n);

    }
    static void displayArray(int[] arr,int n){
       
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void insertionsort(int[] arr, int n){
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int j=i-1;
           while(j>=0 && curr<arr[j]){
            arr[j+1]=arr[j]; 
            j--;
           }
           arr[j+1]=curr;
        }
    }
}

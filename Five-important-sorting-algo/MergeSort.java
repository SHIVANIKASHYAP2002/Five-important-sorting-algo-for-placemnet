import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before Sorting\n");
        displayArray(arr,n);
        mergeSort(arr,0,n-1);
        System.out.println("ArrayAfter soting\n");
        displayArray(arr, n);

    }
    static void displayArray(int[] arr,int n){
       
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    static void mergeSort(int[] arr,int l,int h){
        if(l==h){
            return;
        }
        int mid=(l+h)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, h);
        merge(arr,l,mid,h);
        
    }
    static void merge(int []arr,int l,int mid,int h){
        int i=l,j=mid+1;
        int k=l;
        int []b=new int [10];
        while(i<=mid && j<=h){
            if(arr[i]<=arr[j]){
                b[k]=arr[i];
                i++;k++;
            }
            else{
                b[k]=arr[j];
                j++;k++;
            }
        }
        while(i<=mid){
            b[k]=arr[i];
            i++;k++;
        }
        while(j<=h){
            b[k]=arr[j];
            j++;k++;
        }
        for(int p=l;p<=h;p++){
            arr[p]=b[p];
        }
    }
}

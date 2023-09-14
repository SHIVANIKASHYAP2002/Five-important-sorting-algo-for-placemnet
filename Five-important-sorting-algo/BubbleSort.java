import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before Sorting");
        displayArray(arr,n);
        bubbleSort(arr, n);
        System.out.println("ArrayAfter soting\n");
        displayArray(arr,n);

    }
    static void displayArray(int[] arr,int n){
       
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    static void bubbleSort(int[] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>=arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
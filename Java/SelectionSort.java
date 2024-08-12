import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    static void selectionSort(int arr[],int size){
        
        for(int j=0; j<size-1;j++){
            int min=j;
            for(int i=j+1;i<size;i++){
                if(arr[i]<arr[min]){
                  min=i;
    
                }
            }
            int temp =arr[j];
            arr[j]=arr[min];
            arr[min]=temp;
        }
        
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String [] args){
        System.out.print("Enter Size of Array => ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        selectionSort(arr, size);
    }
}

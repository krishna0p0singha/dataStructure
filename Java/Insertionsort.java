import java.util.Scanner;
import java.util.Arrays;
class Insertionsort{
    static void InsertionSort(int arr[],int size){
        for(int i=1;i<size;i++){
            int min=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]> min) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=min;
        }
        System.out.println("Sorted Array =>"+Arrays.toString(arr));
    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter The Size of array => ");
    int size = sc.nextInt();
    int[] arr=new int[size];
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    sc.close();
    InsertionSort(arr, size);
}
}
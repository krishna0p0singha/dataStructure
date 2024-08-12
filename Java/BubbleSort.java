import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort{
  static void bubbleSort(int arr[]){
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length-i-1;j++){
        if(arr[j]>arr[j+1]){
          int temp =arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
  }
    public static void main(String [] args){ 
      System.out.print("Enter Size Of Array => ");
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
        int arr[]= new int[size];
          for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
          }
          sc.close();
       bubbleSort(arr);
    } 
}
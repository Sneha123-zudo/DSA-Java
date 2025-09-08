import java.util.*;
public class reversewithpointers{
    public void swapArray(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public void reverseArray(int[] arr){
        int i = 0 , j = arr.length-1;
        while(i<j){
            swapArray(arr,i,j);
            i++;
            j--;
        }
    }
    public void printArray(int[] arr){
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of an array: ");
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }     
        reversewithpointers obj = new reversewithpointers();
        obj.reverseArray(arr);
        obj.printArray(arr);
    }
}
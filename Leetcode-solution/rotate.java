import java.util.*;
public class rotate{
    static void reverse(int[] arr, int i, int j ){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
    static void rotateInPlace(int [] arr, int k){
        int n = arr.length;
        k = k%n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
    static void printArray(int arr[]){
        System.out.println("Rotated Array: ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotateInPlace(arr, k);
        printArray(arr);
    }}

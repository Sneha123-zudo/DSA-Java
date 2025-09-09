import java.util.*;
public class rotatearray{
    static int [] rotateArray(int[] arr , int k){
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;
        k = k % n;
        for(int i = n-k; i<n; i++){
            ans[j++] = arr[i];
        }
        for(int i = 0; i<n-k ; i++){
            ans[j++] = arr[i];
        }        
        return ans;

    }
    public void printArray(int[] arr){
        System.out.println("Rotated array: ");
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
        System.out.println("Enter the value how many times you wnat to rotate array: ");
        int k = sc.nextInt();
        int ans [] = rotateArray(arr, k);
        rotatearray obj = new rotatearray();
        obj.printArray(ans);
    }}

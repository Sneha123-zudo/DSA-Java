
import java.util.*;
public class reversearr{
    static int[] revarray(int[] arr){
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;
        for(int i = n-1; i>=0 ; i--){
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of an array:");
        int arr[] = new int[size];
        for(int i = 0; i < arr.length ; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.println("Reversed Array: " + Arrays.toString(revarray(arr)));

    }
}
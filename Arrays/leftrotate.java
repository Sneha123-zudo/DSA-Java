import java.util.*;
public class leftrotate{
    public static void leftRotate(int arr[]){
        int n = arr.length;
        int temp = arr[0];
        for(int i = 1; i<n; i++){
            arr[i-1] = arr[i];

        }
        arr[n-1] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i<size; i++){
            arr[i] = sc.nextInt();

        }

        leftRotate(arr);
        System.out.println("Final array: " + Arrays.toString(arr));

    }}

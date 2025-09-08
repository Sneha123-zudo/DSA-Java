import java.util.*;

public class returnfirstrepeated{
    static int repeatElement(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n ; j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }

        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of an array: ");
        int arr[] = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The repeated element is: " + repeatElement(arr));


    }
}
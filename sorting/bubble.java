//Bubble sorting
import java.util.*;
public class bubble{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the values of array: ");
        //Taking input values of array
        for(int i = 0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        //Ascending order
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // For descending just change the condition
        //if(arr[j]<arr[j+1])

        //printing values of array
        System.out.println("Print the values of sorted array: ");
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
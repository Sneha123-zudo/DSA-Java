
import java.util.*;

public class duplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements of an array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = 0;
        for(int j = 1; j<arr.length; j++){
            if(arr[j]!=arr[x]){
                arr[x+1] = arr[j];
                x++;
            }
        }
            System.out.println("New Array: " + x + 1 + " ");
        }
    }

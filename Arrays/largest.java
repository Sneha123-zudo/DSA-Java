import java.util.*;
public class largest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements of an array: ");
        for(int i = 0; i<arr.length; i++ ){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest element: " + largest);

    }
}
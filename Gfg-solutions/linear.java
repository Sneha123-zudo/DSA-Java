
import java.util.*;

class linear {

    public int search(int arr[], int x) {
        // code here
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int x = sc.nextInt();
        linear obj = new linear();
        int result = obj.search(arr, x);
        if (result == -1) {
            System.err.println("Element not found");
        } else {
            System.err.println("Element found : " + result);

        }

    }
}


import java.util.*;

class insertion {

    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
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
        insertion obj = new insertion();
        obj.insertionSort(arr);
        System.out.print("Sorted array: " + Arrays.toString(arr));
    }
}

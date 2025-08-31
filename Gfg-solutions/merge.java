import java.util.*;

class merge {
    public static void conquer(int arr[], int l, int mid , int r) {
        int merged[] = new int[r - l + 1];
        int idx1 = l;
        int idx2 = mid + 1;
        int x = 0;

        // Merge two sorted halves
        while (idx1 <= mid && idx2 <= r) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Copy remaining elements
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= r) {
            merged[x++] = arr[idx2++];
        }

        // Copy back into original array
        for (int i = 0, j = l; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void mergeSort(int arr[], int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = l + (r - l) / 2;
        mergeSort(arr, l, mid);      // left part
        mergeSort(arr, mid + 1, r); // right part
        conquer(arr, l, mid, r);    // merge
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

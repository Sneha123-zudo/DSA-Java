import java.util.Arrays;

class Binarysearch {
    public int binarysearch(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1; // Stores the potential first occurrence index

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == k) {
                result = mid; // A potential first occurrence is found
                end = mid - 1; // Continue searching on the left side
            } else if (arr[mid] < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 23, 4, 56, 7};
        int target = 5;
        
        // Sort the array before performing binary search
        Arrays.sort(arr); // arr becomes {1, 4, 7, 23, 56}
        
        Binarysearch obj = new Binarysearch();
        int result = obj.binarysearch(arr, target);
        if(result == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at index " + result);
        }
    }
}
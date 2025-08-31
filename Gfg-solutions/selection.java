import java.util.*;
class selection {
    void selectionSort(int[] arr) {
        // code here
        for(int i = 0; i<arr.length-1; i++){
            int smallest = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
            
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        selection obj = new selection();
        obj.selectionSort(arr);
        System.out.print("Sorted array: " + Arrays.toString(arr));
    }
}
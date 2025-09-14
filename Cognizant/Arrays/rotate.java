public class rotate{
    public static void reverse(int arr[] , int i , int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp; 
            i++;
            j--;
        }
    }
    public static void rotate(int k, int arr[]){
        int n = arr.length;
        k = k%n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 3;
        rotate(k, arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
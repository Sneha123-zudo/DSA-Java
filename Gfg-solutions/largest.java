import java.util.*;
class largest {
    public static int largestElement(int[] arr) {
        // code here
        int large = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements of an array: ");
        for(int i = 0; i<arr.length; i++ ){
            arr[i] = sc.nextInt();
        }
        largest obj = new largest();
        int result = obj.largestElement(arr);
        System.out.println("Largest element: " + result);
      
        
    }
    
}

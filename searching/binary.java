public class binary {
    public static int binary(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
             int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid + 1;
            }
               
            else{
                 end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,23,4,56,7};
        int target = 5;
        int result = binary(arr, target);
        if(result==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found");
        }
    }
}
public class secondlarge{
    public static void main(String[] args) {
        int arr[] = {1,2,33,45,66,3};
        int largest = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int secondLargest = -1;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
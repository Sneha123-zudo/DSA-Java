public class largest{
    public static void main(String[] args) {
        int arr[] = {1,2,883,5};
        int largest = arr[0];
        for(int i = 0; i<arr.length; i++){

            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
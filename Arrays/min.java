public class min{
    public static void main(String[] args) {
       int arr[] = {10,20,30,78,90};
       int largest = arr[0];
       for(int i = 1; i<arr.length; i++){
           if(arr[i]>largest){
               largest = arr[i];
           }
       }
       int smallest = -1;
       for(int i = 0; i<arr.length;i++){
           if(arr[i]>smallest && arr[i]!=largest){
               smallest = arr[i];
           }
       }
       int min = arr[0];
       for(int i = 1; i<arr.length ; i++){
           if(arr[i]<min){
               min = arr[i];
           }
       }
       
       
       System.out.println(largest);
       System.out.println(smallest);
       System.out.println(min);

       
    }
}

import java.util.*;
class secondlarge{
    public int getSecondLargest(int[] arr) {
        int largest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        int secondLargest = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > secondLargest && arr[i]!=largest){
                secondLargest = arr[i];

                
            }
        }
         return secondLargest;
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int arr[] = new int[size];
            for(int i = 0; i<arr.length; i++ ){
                arr[i] = sc.nextInt();
                
            }
            secondlarge obj = new secondlarge();
            int result = obj.getSecondLargest(arr);
            System.out.println(result);
            
            
            
        }
    
}
        
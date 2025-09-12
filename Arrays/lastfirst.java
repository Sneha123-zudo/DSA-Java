public class lastfirst{
    public static void element(int[] arr){
        int n = arr.length;
        int first = arr[0];
        int last = arr[n-1];
        System.out.println("First Element: " + first);
        System.out.println("Last Element: " + last);
        

    }
    public static void main(String[] args){
        int arr[] = {1,2,34,5,7,8,9};
        element(arr);
        
    }
}
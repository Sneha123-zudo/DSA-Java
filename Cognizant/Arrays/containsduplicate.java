public class containsduplicate{
    public static boolean  duplicate(int arr[]){
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j <arr.length; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,34,5};
        System.out.println(duplicate(arr));
    }
}
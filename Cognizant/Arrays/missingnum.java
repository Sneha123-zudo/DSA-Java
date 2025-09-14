public class missingnum{
    public static int missnum(int arr[]){
        int n = arr.length+1;
        for(int i = 1; i<n; i++){
            int flag = 0;
            for(int j = 0; j<arr.length;j++){
                if(arr[j]==i){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
            return i;
        }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7};
        int result = missnum(arr);
        System.out.println(result);
    }
}
public class removedup{
    static int[] duplicates(int[] arr){
        int n = arr.length;
        int ans[] = new int[n];
        int k = 0;
        for(int i = 0; i<n; i++){
            boolean isduplicate = false;
            for(int j = 0; j<i; j++){
                if(arr[i]==arr[j]){
                    isduplicate = true;
                    break;
                }
            }
             if (!isduplicate) {
                ans[k++] = arr[i];
        }

    }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = ans[i];
        }
        return result;
}
public static void main(String[] args) {
        int[] arr = {4, 5, 9, 4, 9, 7, 8, 5};
        int[] ans = duplicates(arr);

        System.out.print("Array after removing duplicates: ");
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        

        }
    }


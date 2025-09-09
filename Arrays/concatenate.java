 import java.util.*; 
public class concatenate{
 // needed for Arrays.toString()
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2 * n];
        int idx = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                ans[idx++] = nums[j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        concatenate obj = new concatenate();   // works fine
        int ans[] = obj.getConcatenation(arr);

        System.out.print(Arrays.toString(ans));
    }
}


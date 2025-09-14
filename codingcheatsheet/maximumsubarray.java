public class maximumsubarray{
    public static int subarraySum(int[] arr){
        int curresntSum = arr[0];
        int maxsum = arr[0];
        for(int i = 1; i<arr.length; i++){
            curresntSum = Math.max(arr[i],curresntSum+arr[i]);
            maxsum = Math.max(maxsum,curresntSum);

        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[] = { -2,1,-3,4,-1,2,1,-5,4};
        int result = subarraySum(arr);
        System.out.println("Sum: " + result);
    }
}
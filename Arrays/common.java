public class common{
    public static void findcommon(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;

        for(int i = 0; i<n1; i++){
            for(int j = 0; j<n2; j++){
                if(arr1[i]==arr2[j]){
                    boolean isalreadyprinted = false;
                    for(int k = 0; k<i;k++){
                        if(arr1[k]==arr1[i]){
                            isalreadyprinted = true;
                            break;
                        }
                    }
                    if(!isalreadyprinted){
                        System.out.print(arr1[i] + " ");
                    }

                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr1[] = {12,3,46,78,8};
        int arr2[]  = {12,67,4,5,8};
        findcommon(arr1, arr2);
    }
}
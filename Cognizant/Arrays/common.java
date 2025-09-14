public class common{
    public static void main(String[] args){
        int arr1[] ={1,2,3,4,5};
        int arr2[] ={3,4,5,6,7,8};
        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    boolean alreadyprinted = false;
                    for(int k = 0; k<i ; k++){
                        if(arr1[k]==arr1[i]){
                            alreadyprinted = true;
                            break;
                        }
                    }
                    if(!alreadyprinted){
                        System.out.println(arr1[i] + " ");
                    }
                }
            }
        }

    }
}

import java.util.Arrays;

public class merged{
    public static int [] mergearr(int arr1[] , int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int mergedarray[] = new int[n1+n2];
        int k = 0, i= 0 , j =0;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                mergedarray[k++]=arr1[i++];
            }
            else{
                mergedarray[k++]=arr2[j++];
            }
        }
        while(i<n1){
            mergedarray[k++]=arr1[i++];
        }
        while(j<n2){
            mergedarray[k++]=arr2[j++];
        }
        return mergedarray;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10};
        int merged [] = mergearr(arr1, arr2);
        System.out.println(Arrays.toString(merged));
    }
}
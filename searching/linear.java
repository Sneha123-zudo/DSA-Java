import java.util.*;
public class linear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the values of array: ");
        //Taking input values of array
        for (int i = 0; i < size; i++) {
        arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element you want to search: ");
        int x = sc.nextInt();
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==x){
                System.out.print(i);
            }
        }

    }
}
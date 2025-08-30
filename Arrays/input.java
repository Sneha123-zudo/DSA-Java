// Take an array as input from user , search for a given number x and print the index at which it occurs
import java.util.*;
public class input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int num[] = new int[size];
        for (int i = 0; i<size; i++){
            num[i] = sc.nextInt();
        }
        System.out.print("Enter the num: ");
        int x = sc.nextInt();
        for(int i = 0; i<num.length; i++){
            if(x ==num[i]){
                System.out.println(i);
            }
        }

    }
}
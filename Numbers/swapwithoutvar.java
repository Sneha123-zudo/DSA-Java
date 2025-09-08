import java.util.*;
public class swapwithoutvar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter a 2nd number: ");
        int b = sc.nextInt();

        System.out.println("The numbers before swapping: " + a + " and " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("The numbers after swapping: " + a + " and " + b);
    }
}

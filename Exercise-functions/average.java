//Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
public class average{
    public static void calculateAverage(int a, int b , int c){
        int avg = (a + b + c)/3;
        System.out.println(avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int c = sc.nextInt();
        calculateAverage(a, b, c);
    }
}
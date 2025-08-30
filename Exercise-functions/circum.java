//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;

public class circum{
    public static double circlecircum(double n){
        double c = 2*Math.PI*n;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        int a = sc.nextInt();
        System.out.println(circlecircum(a));
    }
}
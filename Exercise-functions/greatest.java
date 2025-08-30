//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;
public class greatest{
    public static void greatestnum(int a, int b){
        if(a>b){
            System.out.println("a is greatest");
        }
        else{
            System.out.println("b is greatest");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();
        greatestnum(a, b);
    }
}
import java.util.*;
public class question3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digits: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        char q = (char) a;
        char w = (char) b;
        char x = (char) c;
        char y = (char) d;

        System.out.println();
        System.out.print(a);
        System.out.println(" - " + q);
        System.out.print(b);
        System.out.println(" - " + w);
        System.out.print(c);
        System.out.println(" - " + x);
        System.out.print(d);
        System.out.println(" - " + y);
    }
}
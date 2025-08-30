import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        System.out.print("Fibonacci Series of " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            
            int next = first + second; // sum of previous two
            first = second;
            second = next;
        }

        sc.close();
    }
}

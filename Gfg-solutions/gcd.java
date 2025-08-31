import java.util.*;

class gcd {
    public static int[] lcmAndGcd(int a, int b) {
        int originalA = a;
        int originalB = b;

        // Find GCD using Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;
        int lcm = (originalA * originalB) / gcd;

        return new int[]{lcm, gcd};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] result = lcmAndGcd(x, y);
        System.out.println("LCM = " + result[0] + ", GCD = " + result[1]);

        sc.close();
    }
}

import java.util.*;

class palindrome {

    public static boolean isPalindrome(int x) {
        int rev = 0, original = x;
        
        while (x > 0) {
            rev = (rev * 10) + (x % 10);
            x = x / 10;
        }
        
        return rev == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}

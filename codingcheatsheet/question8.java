import java.util.*;
public class question8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid input");
        }
        else{
            if(isPalindrome(n)){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not palindrome");
            }
        }

    }
    public static boolean isPalindrome(int num){
        int originalNum = num;
        int rev = 0;
        while(num>0){
            rev = rev*10+num%10;
            num = num / 10;

        }
        return rev == originalNum;
    }
}
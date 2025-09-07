import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0 , n;
        n = x;
        while(x>0){
            rev = (rev*10)+x%10;
            x = x/10;
        }
        return rev==n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Solution obj = new Solution();
        if(obj.isPalindrome(n)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}
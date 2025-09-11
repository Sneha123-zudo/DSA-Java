import java.util.*;
public class palindromic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        StringBuilder gtr = new StringBuilder(str);
        gtr.reverse();
        String s = gtr+"";
        if(str.equals(s)){
            System.out.println("Palindromic");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
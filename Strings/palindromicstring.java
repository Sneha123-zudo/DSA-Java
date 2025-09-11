import java.util.*;
public class palindromicstring{
    public static boolean isPlaindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int count = 0;
    String str = sc.nextLine();
    System.out.println(str);
    for(int i = 0; i<str.length(); i++){
        for(int j = i+1; j<=str.length(); j++){
            if(isPlaindrome(str.substring(i,j))==true){
                System.out.println(str.substring(i,j) + "");
                count++;
            }

        }
    }
    System.out.println(count);
    if(isPlaindrome(str)){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not Palindrome");
    }

}
}
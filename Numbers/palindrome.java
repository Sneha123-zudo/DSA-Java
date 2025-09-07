import java.util.*;
class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev=0;
        int p = n;
        while(n>0){
            rev=(rev*10)+n%10;
            n=n/10;
        }
        if(p==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
            }
    }

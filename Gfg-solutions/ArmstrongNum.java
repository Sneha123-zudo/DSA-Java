// User function Template for Java
import java.util.*;
class ArmstrongNum {
    static boolean armstrongNumber(int n) {
        // code here
        int sum = 0;
        int originalNum = n;
        while(n>0){
            int rem = n%10;
            sum = sum + (rem*rem*rem);
            n=n/10;
        }
        return sum == originalNum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        if(armstrongNumber(x)){
           System.out.print("Armstrong Number");
        }
        else{
           System.out.print("Not Armstrong Number");

        }
        
    }
}
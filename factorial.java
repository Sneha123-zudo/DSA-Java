import java.util.*;
public class factorial{
    public static void calculateFactorial(int n){
        if(n<0){
            System.out.println("Invalid Number");
        }
        else if(n==0 && n==1){
            System.out.println(1);
        }
        else{
            int fact = 1;
            for(int i = n; i>=1; i--){
            fact = fact * i;
            }
            System.out.println(fact);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calclate a factorial: ");
        int a = sc.nextInt();
       calculateFactorial(a);
    }
}

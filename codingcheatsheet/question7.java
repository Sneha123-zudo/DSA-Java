import java.util.*;
public class question7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first range: ");
        int n =sc.nextInt();
        System.out.println("Enter last range: ");
        int m = sc.nextInt();
        if(n<=0||m<=0||n>=m){
            System.out.println("Provide valid input");
            return;
        }
        System.out.println("Prime numbers are: ");
        for(int i = n; i<=m; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n){
        if(n< 2) return false;
        int j = 2;
        while(j*j<=n){
            if(n%j==0){
                return false;
            }
            j++;
        }
        
        return true;
    }
}
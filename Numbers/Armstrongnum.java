import java.util.*;
class Armstrongnum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int m = n;
        while(n>0){
            int rem = n%10;
            sum = sum + (rem*rem*rem);
            n = n/10;

        }
        if(m==sum){
            System.err.println("Armstrong Number");
        }
        else{
            System.err.println("Not an Armstrong number");
        }
    }
}
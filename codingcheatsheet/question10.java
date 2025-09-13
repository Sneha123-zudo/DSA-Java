import java.util.*;
public class question10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the car no.: ");
        int n = sc.nextInt();

        if(n<1000 || n>9999){
            System.out.println("Invalid");
        }
        else{
            while(n!=0){
                int rem = n%10;
                sum = sum + rem;
                n = n/10;
            }
                    if(sum%3==0 || sum%5==0 || sum%7==0){
            System.out.println("Lucky Number");
        }
        else{
            System.out.println("Not lucky number");
        }
            
        }

    }
}
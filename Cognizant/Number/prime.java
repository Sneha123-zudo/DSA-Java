import java.util.*;
public class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean isprime = true;
        if(a<2){
            isprime = false;            
        }
        else{
            for(int i = 2; i<=Math.sqrt(a); i++){
                if(a%i==0){
                    isprime = false;
                }
            }
        }
        if(isprime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }

    }
}
import java.util.*;
class productnum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int pro =1 ;
        while(n>0){
            pro=pro+n%10;
            n=n/10;
        }
        System.out.println("Product: " + pro);
      
        }
    }

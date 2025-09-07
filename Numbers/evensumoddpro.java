import java.util.*;
public class evensumoddpro{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        int sum=0;
        int pro=1;
        while(n>0){
            if(n%2==0){
                sum=sum+n%10;
            }
            else{
                pro = pro*n%10;
            }
            n=n/10;
        }
        System.out.println("Sum: " + sum + " " + "Product: " + pro);
    }
}
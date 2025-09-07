import java.util.*;
class countdigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0 ;
        int r;
        while(n>0){
            r = n % 10;
            count = count + 1;
            n = n/10;
        }
              System.out.println(count);
    }
}
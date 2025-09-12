
import java.util.Scanner;

public class printprime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first range: ");
        int n = sc.nextInt();
        System.out.println("Enter the last range: ");
        int m = sc.nextInt();
        int count;
        System.out.print("Prime Numbers are: ");
        for(int i = n; i<=m;i++){
            count = 0;
            for(int j = 1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i + " ");
            }
        }

    }
}
import java.util.*;
public class question14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println("No factors");
        }
        else if(n>0){
            for(int i = 1; i<n; i++){
                if(n%i==0){
                    System.out.print(i + " ");
                }
            }
            System.out.println(n);
        }
        else{
            n = n*-1;
            for(int i = 1; i<n; i++){
                if(n%i==0){
                    System.out.print(i + " ");
                }
            }
            System.out.println(n);
        }
    }}

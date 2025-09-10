import java.util.*;
public class substring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter a String: ");
        String str = sc.nextLine();
        for(int i = 0; i<=3;i++){
            for(int j = i+1; j<=4; j++){
                System.err.print(str.substring(i,j) + " ");
            }
        }

        
    }}

// User function Template for Java
import java.util.*;
class leap{
    static boolean isLeap(int N) {
        // code here
        if(N%400==0){
            return true;
        }
        if(N%4==0 && N%100!=0){
            return true;
        }
        return false;            
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.err.print("Enter the year: ");
            int year = sc.nextInt();
            System.out.println(isLeap(year));


        }}


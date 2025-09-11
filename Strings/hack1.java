import java.util.*;

public class hack1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String C = A.concat(B);
        System.out.println(C.length());
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String Acapitalised = A.substring(0,1).toUpperCase() + A.substring(1);
        String Bcapitalised = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(Acapitalised + " " + Bcapitalised);

    }
}




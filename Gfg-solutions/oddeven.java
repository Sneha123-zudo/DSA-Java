//Given a positive integer n, determine whether it is odd or even. Return true if the number is even and false if the number is odd.

import java.util.*;
class oddeven{
    static boolean isEven(int n) {
        // code here
        if(n%2==0){
            return Boolean.TRUE;
        }
        else{
            return Boolean.FALSE;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        isEven(a);
        
    }
}
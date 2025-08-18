


//import java.util.*;
//
//public class functions{
//    public static void printMyName(String name){
//        System.out.println(name);
//        return;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        printMyName(name);
//
//    }
//}


import java.util.*;

public class functions{
    public static int CalculateSum(int a, int b){
       int sum = a + b;
       System.out.println(sum);
       return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        CalculateSum(a, b);
    }}

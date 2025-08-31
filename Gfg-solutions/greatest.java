import java.util.*;
//Given 3 numbers a, b and c. Find the greatest number among them.
class greatest {
    public int greatestOfThree(int a, int b, int c) {
        // code here
        if(a>=b && a>=c){
            return a;
        }
        else if(b>=a && b>=c){
            return b;
        }
        else{
            return c;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int x = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int y = sc.nextInt();
        System.out.print("Enter the 3rd number: ");
        int z = sc.nextInt();
        greatest obj = new greatest();
        int result = obj.greatestOfThree(x,y,z);
        System.out.print("The greatest number is: " + result);

        

    }
}

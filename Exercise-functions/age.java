//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.*;

public class age{
    public static void ageeligible(int age){
        if(age<=0){
            System.out.println("Please enter a valid age");
        }
        else if(age>18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");

        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int a = sc.nextInt();
    ageeligible(a);
    }
}
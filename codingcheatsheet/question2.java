import java.util.*;
public class question2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of pizzas bought: ");
        int pizzas = sc.nextInt();
        System.out.print("Enter the no of puffs bought: ");
        int puffs = sc.nextInt();
        System.out.print("Enter the no of cool drinks bought: ");
        int drinks = sc.nextInt();
        int pizza = pizzas*100;
        int puff = puffs*20;
        int drink = drinks*10;
        int total = pizza + puff + drink;
        System.out.println("Bill Details: ");
        System.out.println("No of pizzas: " + pizzas);
        System.out.println("No of puffs: " + puffs);
        System.out.println("No of drinks: " + drinks);
        System.out.println("Total Price: " + total);


    }
}
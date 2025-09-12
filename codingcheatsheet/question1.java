import java.util.*;
public class question1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the litres: ");
        int lit = sc.nextInt();
        if(lit<1){
            System.out.println("Invalid input");
            return;
        }
        System.out.println("Enter distance: ");
        int dist = sc.nextInt();
        if(dist<1){
            System.out.println("invalid input");
        }
        double litrecon = (lit*100.0)/dist;
        System.out.println("Liters/KM");
        System.out.printf("%.2f\n" , litrecon);
        double miles = dist*0.6214;
        double gallons = lit*0.2642;
        double mgp = miles/gallons;
        System.out.println("Miles/Gallons");
        System.out.printf("%.2f\n" , mgp);
    }

}
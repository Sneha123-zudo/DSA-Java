import java.util.*;
public class question11{
    public static void main(String[] args) {
        int flag = 0;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of courses: ");
        n = sc.nextInt();
        sc.nextLine();
        if(n<=0||n>20){
            System.out.println("Invalid Range");
            return;
        }
        System.out.println("Enter the names of courses: ");
        String courses[] = new String[n];
        for(int i = 0; i<courses.length; i++){
            courses[i] = sc.nextLine();
        }
        System.out.println("Enter the course to be searched: ");
        String search = sc.nextLine();
        for(int i = 0; i<courses.length; i++){
            if(courses[i].equals(search)){
                flag = 1;
                
            }
        }
        if(flag==1){
            System.out.println( search + " course is available");
        }
        else{
            System.out.println(search + " course is not available");
        }
    }}

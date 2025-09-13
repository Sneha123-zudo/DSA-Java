
import java.util.*;

public class question13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of semester: ");
        int sem = sc.nextInt();
        int subjects[] = new int[sem];
        for (int i = 0; i < sem; i++) {
            System.out.println("Enter the no. of subjects in semester " + (i + 1));
            subjects[i] = sc.nextInt();

        }
        int maxMarks[] = new int[sem];
        for (int i = 0; i < sem; i++) {
            System.out.println("Marks obtained in semester " + (i + 1));
            int max = sc.nextInt();
            if (max < 0 || max > 100) {
                System.out.println("Invalid marks out of range");
                System.exit(0);
            }
            for (int j = 1; j < subjects[i]; j++) {
                int marks = sc.nextInt();
                if (max < 0 || max > 100) {
                    System.out.println("Invalid marks out of range");
                    System.exit(0);
                }
                if (max < marks) {
                    max = marks;
                }

            }
            maxMarks[i] = max;
        }

        for(int i = 0; i<sem; i++){
            System.out.println("Maximum marks in semester " + (i+1) + "is " + maxMarks[i]);
        }
    }
}

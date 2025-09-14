
import java.util.*;

public class rowcol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the no. of columns");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int maxRowsum = Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++) {
            int rowsum = 0;
            for (int j = 0; j < cols; j++) {
                rowsum += matrix[i][j];

            }
            if (maxRowsum < rowsum) {
                maxRowsum = rowsum;
            }
        }
        int maxColumnSum = Integer.MIN_VALUE;
        for (int j = 0; j < cols; j++) {
            int colsum = 0;
            for (int i = 0; i < rows; i++) {
                colsum += matrix[i][j];

            }
            if (maxColumnSum < colsum) {
                maxColumnSum = colsum;
            }
        }
        int luckynumber = maxRowsum + maxColumnSum;
        System.out.println("Lucky number is :" + luckynumber);
    }
}

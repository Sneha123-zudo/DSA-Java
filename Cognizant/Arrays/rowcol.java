public class rowcol{
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        int maxRowsum = Integer.MIN_VALUE;
        for(int i = 0; i<rows;i++){
            int rowsum = 0;
            for(int j = 0; j<cols;j++){
                rowsum+=matrix[i][j];
            }
            if(maxRowsum<rowsum){
                maxRowsum=rowsum;
            }
        }
        int maxColSum = Integer.MIN_VALUE;
        for(int i = 0; i<cols;i++){
            int colsum = 0;
            for(int j = 0; j<rows;j++){
                colsum+=matrix[j][i];
            }
            if(maxColSum<colsum){
                maxColSum = colsum;
            }
        }
        int luckynum = maxColSum + maxRowsum;
        System.out.println(luckynum);
    }
}
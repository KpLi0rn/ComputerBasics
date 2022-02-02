package Day5;
import java.util.*;

public class Solution10 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        new Solution10().setZeroes(matrix);
    }

    public void setZeroes(int[][] matrix) {
        int index = 0;
        List<List<Integer>> lists = new ArrayList<>();
        int i,j;
        for (i = 0;i < matrix.length; i++){
            for (j = 0;j < matrix[0].length; j++){
                int zero = matrix[i][j];
                if (zero == 0){
                    lists.add(index++,new ArrayList<>(Arrays.asList(i,j)));
                }
            }
        }

        for (i = 0; i < index  ; i++){
            int matx = lists.get(i).get(0);
            int maty = lists.get(i).get(1);

            for (j = 0;j < matrix.length; j++){
                for (int k = 0;k < matrix[0].length; k++){
                    if (matx == j || maty == k){
                        matrix[j][k] = 0;
                    }
                }
            }
        }
    }
}

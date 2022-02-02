package Day4;

import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("all")
public class Solution8 {

    public static void main(String[] args) {
        int[][] mat = new int[][]{{1,2},{3,4}};
        int r = 4;
        int c = 1;
        new Solution8().matrixReshape(mat,r,c);
    }

    // 想要 1x4
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] trans = new int[r][c];
        int[] elements = new int[r*c];
        Queue<Integer> queue = new LinkedList<>();

        int i = 0;
        int index = 0;
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != c * r){
            return mat;
        }
        while (i < m){
            int j = 0;
            while (j < n){
                System.out.print(mat[i][j]);
                elements[index++] = mat[i][j];
                queue.offer(mat[i][j]);
                j++;
            }
            System.out.print("\n");
            i++;
        }

        for (i=0;i<r;i++){
            for (int j=0;j<c;j++){
                try {
                    trans[i][j] = queue.poll();
                }catch (Exception e){}
            }
        }

        for (i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(trans[i][j]);
            }
            System.out.print("\n");
        }

        return trans;
    }
}

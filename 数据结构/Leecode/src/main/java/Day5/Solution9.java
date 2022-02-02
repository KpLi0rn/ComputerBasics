package Day5;

import java.util.HashMap;

public class Solution9 {

    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(new Solution9().isValidSudoku(board));
    }


    public boolean isValidSudoku(char[][] board) {
        // 区域不能用 hashmap 来处理
        int[][] rows = new int[9][10];
        int[][] columns = new int[9][10];
        int[][] block = new int[9][10];
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length ;j++){
                if (board[i][j] == '.') continue;
                int cur = board[i][j] - '0';

                if ( block[j/3 + (i/3)*3][cur] == 1 )  return false;
                if ( rows[i][cur] == 1 ) return false;
                if ( columns[j][cur] == 1 ) return false;

                rows[i][cur] = 1;
                columns[j][cur] = 1;
                block[j/3 + (i/3)*3][cur] = 1;
            }
        }
        return true;
    }
}

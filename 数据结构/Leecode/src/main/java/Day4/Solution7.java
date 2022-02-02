package Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution7 {

    public static void main(String[] args) {
        int num = 10;
        new Solution7().generate(num);
        System.out.println(new ArrayList<>(Arrays.asList(1,1)));
//        for (int i=0;i<res.length;i++){
//            for (int j=0;j<res[i].length;j++){
//                System.out.print(res[i][j]+"\t");
//            }
//            System.out.print("\n");
//        }

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        int index = numRows - 1;
        for (int i=0;i<=index;i++) {
            List<Integer> columnList = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    columnList.add(1);
                } else {
                    columnList.add(lists.get(i-1).get(j-1) + lists.get(i-1).get(j));
                }
            }
            lists.add(columnList);
        }
        return lists;
    }

}

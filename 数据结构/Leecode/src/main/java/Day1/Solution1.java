package Day1;

import java.util.HashMap;
import java.util.Map;

/**
 * Day 1: 存在重复元素
 */
public class Solution1 {
    public static void main(String[] args) {
//        int[] nums = new int[]{1,1,1,3,3,4,3,2,4,2};
        int[] nums = new int[]{1,2,3,4};
        System.out.println(new Solution1().containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Object> tempMap = new HashMap<>();
        for (int num : nums) {
            if (tempMap.get(num) == null) {
                tempMap.put(num, 1);
            } else {
                return true;
            }
        }
        return false;
    }
}

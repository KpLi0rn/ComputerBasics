package Day2;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 两数之和
 */
public class Soluction3 {
    public static void main(String[] args) {
//        int[] nums = new int[]{2,7,11,15};
//        int[] nums = new int[]{0,3,-3,4,-1};
        int[] nums = new int[]{3,2,4};

        int[] location = new Soluction3().twoSum(nums,6);
        System.out.println(location[0]);
        System.out.println(location[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> temp = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            temp.put(nums[i],i);
        }
        int[] location = new int[2];
        for (int i=0;i<nums.length;i++){
            int minus = target - nums[i];
            if (temp.containsKey(minus) && i != temp.get(minus)){
                location[0] = i;
                location[1] = temp.get(minus);
                return location;
            }
        }
        return location;
    }
}

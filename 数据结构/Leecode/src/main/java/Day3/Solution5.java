package Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution5 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
        int[] res = new Solution5().intersect(nums1,nums2);
        for (int n:res){
            System.out.println(n);
        }
    }

    /**
     * 记录重复的次数，将较少重复的输出出来
     * 这个只是算出重复而已
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        // 确保小的在最前面
        if (nums1.length > nums2.length){
            return intersect(nums2,nums1);
        }

        // 创建一个 map
        HashMap<Integer,Integer> temp = new HashMap<>();
        for (int num:nums1){
            int count = temp.getOrDefault(num,0) + 1;
            temp.put(num,count);
        }

        int[] result = new int[nums1.length];
        int index = 0;
        // 好牛逼啊草
        for (int num:nums2){
            int count = temp.getOrDefault(num,0);
            // 说明这是重复的数
            if (count > 0){
                result[index++] = num;
                count--;
                if (count > 0){
                    temp.put(num,count);
                }else {
                    temp.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(result,0,index);
    }


}

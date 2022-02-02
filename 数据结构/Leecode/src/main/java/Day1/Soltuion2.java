package Day1;

import java.util.Arrays;

public class Soltuion2 {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
//        int[] nums = new int[]{-1};
        System.out.println(new Soltuion2().maxSubArray(nums));
    }

    /**
     * 暴力会超时 Orz
     * @param nums
     * @return
     */
//    public int maxSubArray(int[] nums) {
//        int max=nums[0];
//        int len = nums.length;
//        for(int i=0;i<len;i++){
//            int sum = 0;
//            for (int j=i;j<len;j++){
//                sum += nums[j];
//                if (sum >= max){
//                    max = sum;
//                }
//            }
//        }
//        return max;
//    }

    /**
     * 动态规划 也太牛逼了吧
     *
     */

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int pre = 0;
        for (int i=0;i<nums.length;i++){
            // 如果前面的加自身 还不如自己大就把前面扔了 针对负数情况
            pre = Math.max(pre + nums[i],  nums[i]);
            max = Math.max(max,pre);
        }
        return max;
    }



}

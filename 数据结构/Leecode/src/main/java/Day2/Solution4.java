package Day2;

import java.util.Arrays;

public class Solution4 {

    public static void main(String[] args) {

        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        new Solution4().merge(nums1,0,nums2,1);

//        int[] nums1 = new int[]{1,2,3,0,0,0};
//        int[] nums2 = new int[]{2,5,9};
//        new Solution4().merge(nums1,3,nums2,3);

    }

    /**
     * 先和一起，然后sort,作弊 ...
     */
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        for (int i=m;i<m+n;i++){
//            nums1[i] = nums2[i-m];
//        }
//        Arrays.sort(nums1);
//        for (int number:nums1){
//            System.out.println(number);
//        }
//    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i=m+n-1;i>=0;i--){
            if (m==0 || ( n>=1 && nums2[n-1]>nums1[m-1])){
                nums1[i] = nums2[--n];
            }else {
                nums1[i] = nums1[--m];
            }
        }

        for (int number:nums1){
            System.out.println(number);
        }
    }
}

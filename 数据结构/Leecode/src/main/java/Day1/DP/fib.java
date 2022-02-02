package Day1.DP;

public class fib {
    public static void main(String[] args) {
        Integer[] nums = new Integer[6];
        nums[1] = 1;
        nums[2] = 1;
        for (int i=3;i<5;i++){
            nums[i] = nums[i-1] + nums[i-2];
        }
        System.out.println(nums[4]);
    }
}

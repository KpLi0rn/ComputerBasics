package Day6;

public class Solution13 {
    public static void main(String[] args) {
        String s = "ab";
        String t = "a";
        System.out.println(new Solution13().isAnagram(s,t));
    }

    public boolean isAnagram(String s, String t) {
        if (s.toCharArray().length != t.toCharArray().length) return false;
        int[] nums = new int[26];

        for (char chr : s.toCharArray()){
            nums[chr - 'a']++;
        }

        for (char chr : t.toCharArray()){
            if (nums[chr - 'a'] == 0){
                return false;
            }
            nums[chr - 'a']--;
        }
        return true;
    }
}

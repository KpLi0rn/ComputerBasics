package Day6;

import Day2.Solution4;

import java.util.HashMap;

public class Solution11 {
    public static void main(String[] args) {
        String s = "bd";
        System.out.println(new Solution11().firstUniqChar(s));
//
//        char a = 'z';
//        System.out.println(a-'0');
    }

    public int firstUniqChar(String s) {
        char[] strings = s.toCharArray();
        if (strings.length == 1){
            return 0;
        }
        int[] repeat = new int[75];
        int[] ascii = new int[strings.length];
        int index = 0;
        int tag = 0;
        for (int i = 0;i<strings.length;i++){
            // 如果没有重复的话那么就添加进去
            int cur = strings[i] - '0';
            if (repeat[cur] == 1){
                tag = 1;
                ascii[index++] = cur;
            }
            repeat[cur] = 1;
        }

        if (tag == 0){
            return 0;
        }

        for (int i = 0;i<strings.length;i++) {
            int cur = strings[i] - '0';
            int flag = 0;
            for (int j=0;j<index;j++){
                if (cur == ascii[j]){
                    break;
                }
                if (j == index-1 && cur != ascii[j]){
                    flag = 1;
                }
            }
            if (flag == 1){
                return i;
            }
        }
        return -1;
    }

//    public int firstUniqChar(String s) {
//        char[] strings = s.toCharArray();
//        HashMap<Character,Integer> frequent = new HashMap<>();
//        for (int i = 0;i<strings.length;i++){
//            frequent.put(strings[i],frequent.getOrDefault(strings[i],0)+1);
//        }
//        for (int i = 0;i<strings.length;i++) {
//            if (frequent.get(strings[i]) == 1){
//                return i;
//            }
//        }
//        return -1;
//    }

}

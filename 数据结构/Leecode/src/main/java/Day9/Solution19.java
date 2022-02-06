package Day9;

import java.util.HashMap;
import java.util.Stack;

public class Solution19 {
    public static void main(String[] args) {
        String chars = "(){}[](";
        System.out.println(new Solution19().isValid(chars));
    }

    public boolean isValid(String s) {

        HashMap<Character,Character> temp = new HashMap<>();
        temp.put('(',')');
        temp.put('{','}');
        temp.put('[',']');

        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char ch:chars){
            if (temp.containsKey(ch)){
                stack.push(ch);
            }else{
                if (stack.empty()){
                    return false;
                }
                char right = stack.pop();
                if (!temp.get(right).equals(ch)){
                    return false;
                }
            }
        }
        if (!stack.empty()){
            return false;
        }
        return true;

    }
}

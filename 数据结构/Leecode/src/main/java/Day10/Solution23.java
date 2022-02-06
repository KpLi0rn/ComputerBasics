package Day10;

import java.util.ArrayList;
import java.util.List;

public class Solution23 {

    public static void main(String[] args) {

    }
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        res = orderTraversal(root,res);
        return res;
    }

    public List<Integer> orderTraversal(TreeNode root,List<Integer> res){
        if (root == null){
            return new ArrayList<>();
        }
        orderTraversal(root.left,res);
        orderTraversal(root.right,res);
        res.add(root.val);

        return res;
    }
}

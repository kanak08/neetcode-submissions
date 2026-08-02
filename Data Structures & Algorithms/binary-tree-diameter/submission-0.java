/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    // public int diameterOfBinaryTree(TreeNode root) {
    //     int[] result_arr = new int[1];
    //     dfs(root, result_arr);
    //     return result_arr[0];
    //   }

    // // find maximum depth of node
    // private int dfs(TreeNode node, int[] result_arr){
    //     if(node == null){return 0;}
    //     int l_sum = dfs(node.left, result_arr);
    //     int r_sum = dfs(node.left, result_arr);

    //     result_arr[0]=Math.max(result_arr[0], l_sum+r_sum);
    //     return (1 + Math.max(l_sum,r_sum));
    // }

    public int diameterOfBinaryTree(TreeNode root) {
        int[] res = new int[1];
        dfs(root, res);
        return res[0];
    }

    private int dfs(TreeNode root, int[] res) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left, res);
        int right = dfs(root.right, res);
        res[0] = Math.max(res[0], left + right);
        return 1 + Math.max(left, right);
    }
}

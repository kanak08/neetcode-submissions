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
    public int maxPathSum(TreeNode root) {
        int result[] = new int[1];
        result[0] = Integer.MIN_VALUE;
        findPath(root, result);

        return result[0];
    }

    public int findPath(TreeNode root, int[] result){
        if(root==null){
            return 0;
        }
        int l_sum=Math.max(0,findPath(root.left, result));
        int r_sum=Math.max(0,findPath(root.right, result));

        result[0] = Math.max(result[0], l_sum+r_sum+root.val);

        return root.val+Math.max(l_sum,r_sum);
    }
}
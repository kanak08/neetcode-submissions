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
    public int count;
    public int max=Integer.MIN_VALUE;
    public int goodNodes(TreeNode root) {
        if(root==null){return count;}
        int prevMax = max;
        if(root.val>=max){
            max = root.val;
            count++;
        }
        count = goodNodes(root.left);
        count = goodNodes(root.right);

        max = prevMax;
        return count;
        
    }
}

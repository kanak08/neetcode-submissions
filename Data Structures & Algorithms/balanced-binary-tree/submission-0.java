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
    public boolean isBalanced(TreeNode root) {
        // boolean result = true;
        return (maxHeight(root)==-1)?false:true;
    }

    public int maxHeight(TreeNode node){
        if(node==null){return 0;}
        
        int left = maxHeight(node.left);
        int right = maxHeight(node.right);

        if(left== -1 || right== -1 || Math.abs(left-right)>1){
            return -1;
        }
        else{
            return 1+Math.max(left,right);
        }
    }
}

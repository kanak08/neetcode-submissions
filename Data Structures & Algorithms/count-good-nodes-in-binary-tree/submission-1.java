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
    public int goodNodes(TreeNode root) {
        if(root==null){return 0;}
        int max = root.val;
        
        findGoodNodes(root, max);
        return count;
        
    }
    public void findGoodNodes(TreeNode root, int max){
        if(root==null){return;}
        int prevMax = max;
        if(root.val>=max){
            max = root.val;
            count++;
        }
        findGoodNodes(root.left, max);
        findGoodNodes(root.right, max);

        max = prevMax;
    }
}

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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }

        return buildSubNode(preorder, inorder, hm, 0, preorder.length-1, 0, inorder.length-1);
    }

    public TreeNode buildSubNode(int[] preorder, int[] inorder, HashMap<Integer,Integer> hm, int pstart, int pend, int istart, int iend){
        if(pend-pstart<0 || iend-istart<0){return null;}
        
        int val = preorder[pstart];
        TreeNode root = new TreeNode(val);

        int mid = -1;
        mid = hm.get(val);
        int len = mid-istart;

        root.left = buildSubNode(preorder, inorder, hm, pstart+1, pstart+len, istart, istart+len-1);
        root.right = buildSubNode(preorder, inorder, hm, pstart+1+len, pend, istart+1+len, iend);

        return root;
    }

}

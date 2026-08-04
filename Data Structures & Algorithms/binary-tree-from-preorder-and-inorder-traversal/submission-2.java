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
        return buildSubNode(preorder, inorder);
    }

    public TreeNode buildSubNode(int[] preorder, int[] inorder){
        if(inorder.length==0 || preorder.length==0){return null;}
        
        int val = preorder[0];
        TreeNode root = new TreeNode(val);

        // int mid = Arrays.binarySearch(inorder, val);
        int mid = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                mid = i;
                break;
            }
        }
        int[] left_inorder = Arrays.copyOfRange(inorder,0,mid);
        int[] right_inorder = Arrays.copyOfRange(inorder,mid+1,inorder.length);

        int[] left_preorder = Arrays.copyOfRange(preorder,1,left_inorder.length+1);
        int[] right_preorder = Arrays.copyOfRange(preorder,left_inorder.length+1,preorder.length);


        root.left = buildSubNode(left_preorder, left_inorder);
        root.right = buildSubNode(right_preorder, right_inorder);

        return root;
    }

}

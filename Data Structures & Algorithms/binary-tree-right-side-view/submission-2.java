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
    public List<Integer> rightSideView(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        if(root==null){return result;}
        q.offer(root);
        // result.add(root.val);
        while(!q.isEmpty()){
            int size = q.size();

            result.add(q.peekLast().val);
            // List<TreeNode> list = new ArrayList<>();
            while(size!=0){
                TreeNode node = q.remove();
                if(node.left!=null){q.offerLast(node.left);}
                if(node.right!=null){q.offerLast(node.right);}
                size--;
            }
        }
        return result;
    }
}

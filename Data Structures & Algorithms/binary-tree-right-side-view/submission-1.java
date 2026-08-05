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
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        if(root==null){return result;}
        q.offer(root);
        // result.add(root.val);
        while(!q.isEmpty()){
            int size = q.size();
            List<TreeNode> list = new ArrayList<>();
            while(size!=0){
                TreeNode node = q.remove();
                if(node.left!=null){q.offer(node.left);}
                if(node.right!=null){q.offer(node.right);}
                list.add(node);
                size--;
            }

            result.add(list.get(list.size()-1).val);
        }
        return result;
    }
}

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
    TreeNode first = null;
    TreeNode second = null;
    public void recoverTree(TreeNode root) {
        while(!validate (root , null , null )){
        }
    }
    public boolean validate (TreeNode root , TreeNode min , TreeNode max){
        if(root == null){
            return true;
        }
        if(min != null && root.val <= min.val){
            int temp = min.val;
            min.val=root.val;
            root.val=temp;
            return false;
        }
        if(max!= null && root.val >= max.val){
            int temp = max.val;
            max.val=root.val;
            root.val=temp;
            return false;
        }
        boolean left = validate(root.left , min , root);
        boolean right = validate(root.right , root , max);
        return left && right;
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        
        return findTree(root,val);
    }
    
    public TreeNode findTree(TreeNode root,int val){
        
        if(root ==null || root.val == val){
            return root;
        }
        if(val>root.val){
            
          return findTree(root.right,val);

        }else{
          return findTree(root.left,val);
        }
    }
}

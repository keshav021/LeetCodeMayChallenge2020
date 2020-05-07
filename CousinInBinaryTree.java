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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null) return false;
        if(root.val==x||root.val==y) return false;
        int level=0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size(); int flag1=0; int flag2=0;
            while(n-->0){
                TreeNode temp = q.poll();                
                if(temp.val==x){
                    flag1=1;
                    if(temp.left!=null){
                        if(temp.left.val==y) return false;
                    }
                    if(temp.right!=null){
                        if(temp.right.val==y) return false;
                    }
                }
                if(temp.val==y){
                    flag2=1;
                    if(temp.left!=null){
                        if(temp.left.val==x) return false;
                    }
                    if(temp.right!=null){
                        if(temp.right.val==x) return false;
                    }
                }
                if(temp.val!=x&&temp.val!=y){
                    if(temp.left!=null&&temp.right!=null) {
                        if((temp.left.val==x||temp.left.val==y)&&(temp.right.val==x||temp.right.val==y)){
                            return false;
                        }
                    }
                }
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
             if(flag1==1&&flag2==1) return true;
              if(flag1!=0||flag2!=0) return false;
               
        }
        return true;
    }
}

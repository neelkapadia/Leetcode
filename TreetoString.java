/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
public class TreetoString {
    StringBuilder tree;
    String x;
    public String tree2str(TreeNode t){
        if(t == null)
            return null;
        tree.append(t.val);
        tree2str(t.left);
        tree2str(t.right);
        return x;
    }
    
}

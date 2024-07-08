import Lecture2.TreeNode;
public class bst {
    TreeNode root;

    public static TreeNode insert(TreeNode node, int val){
        if(node == null){
            return new TreeNode(val);
        }

        TreeNode temp = node;
        TreeNode parent = null;

        while(temp!=null){
            parent = temp;
            if(val < temp.val) temp = temp.left;
            if(val > temp.val) temp = temp.right;
        }
    }
}

import java.util.Stack;

public class main {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    
        TreeNode() {
        }
    
        TreeNode(int val) {
            this.val = val;
        }
    
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        
    }

    public void flatten(TreeNode root) {
        TreeNode current = root;
        helper(root);
    }

    public void helper(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        
        while(current != null || !stack.isEmpty()){
            while(current != null){
                stack.push(current);  
                current = current.left;    //traverse to left tree
            }
            
            TreeNode node = stack.pop();
            TreeNode right = node.right;    //store right tree
            node.right = node.left;            //store left in right
            node.left = null;           //mark left with null
            while(node.right != null) node = node.right;   //since we stored left in right traverse to end
            node.right = right;         //store previous right value at end
            current = node.right;           
        }
    }
}
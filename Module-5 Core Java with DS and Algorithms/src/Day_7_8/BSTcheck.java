package Day_7_8;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BSTcheck {

    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = checkHeight(node.left);                                   //     1
        if (leftHeight == -1) return -1;                                          //    /   \
                                                                                 //    2     3
        int rightHeight = checkHeight(node.right);                              //    / \   / \
        if (rightHeight == -1) return -1;                                      //    4   5 6   7
                                                                              //    /
        if (Math.abs(leftHeight - rightHeight) > 1) return -1;               //    8

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        BSTcheck treeChecker = new BSTcheck();
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        //root.right.left=new TreeNode(6);
        //root.right.left=new TreeNode(7);
        root.left.left.left = new TreeNode(8);

        System.out.println("Tree is Balanced ?" +( treeChecker.isBalanced(root)==true ? "Yes":"No"));
    }
}
//code-by-dugar
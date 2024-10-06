class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class MinDepthDFS {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);

        System.out.println("Minimum Depth: " + minDepth(root));  // Output: 2
    }

    private static int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int leftDepth =  (root.left != null) ? minDepth(root.left) : Integer.MAX_VALUE;
        int rightDepth = (root.right != null) ? minDepth(root.right) : Integer.MAX_VALUE;
        return 1 + Math.min(leftDepth, rightDepth);
    }
}
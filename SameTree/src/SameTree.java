
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class SameTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);
        boolean isSame = inSameTree(root, root1);
        System.out.println(isSame);
    }

    private static boolean inSameTree(TreeNode root, TreeNode root1) {
        if (root == null && root1 == null) {
            return true;
        }

        if (root == null || root1 == null || root.val  != root1.val){
            return false;
        }
        return inSameTree(root.left, root1.left) && inSameTree(root.right, root1.right);
    }
}

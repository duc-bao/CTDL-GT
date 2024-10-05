import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
public class BinaryTreeInorder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        // Gọi phương thức inorderTraversal và in kết quả
        List<Integer> result = inorderTraversal(root);
        System.out.println("Inorder Traversal: " + result);
    }

    private static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return  result;
    }

    private static void inorderHelper(TreeNode root, List<Integer> result) {
        if(root == null){
            return;
        }
        inorderHelper(root.left, result);
        result.add(root.val);
        inorderHelper(root.right, result);
    }
}

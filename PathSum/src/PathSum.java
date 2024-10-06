import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
    }
}

public class PathSum {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;
        boolean result = hasPathSum(root, targetSum);
        System.out.println(result);
    }

    private static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null){
            return  false;
        }

        Stack<TreeNode> treeNodes = new Stack<>();
        Stack<Integer> stack = new Stack<>();
        treeNodes.push(root);
        stack.push(targetSum - root.val);
        while (!treeNodes.isEmpty()){
            TreeNode currentNode = treeNodes.pop();
            int currentSum = stack.pop();
            if (currentNode.left == null && currentNode.right == null && currentSum == 0) {
                return true;
            };
            if (currentNode.right != null) {
                treeNodes.push(currentNode.right);
                stack.push(currentSum - currentNode.right.val);
            }

            if (currentNode.left != null) {
                treeNodes.push(currentNode.left);
                stack.push(currentSum - currentNode.left.val);
            }

        }
        return false;
    }

//    private static boolean hasPathSum(TreeNode root, int targetSum) {
//        if (root == null){
//            return  false;
//        }
//
//        if(root.left == null && root.right == null ){
//            return  root.val == targetSum;
//        }
//        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
//
//    }

}
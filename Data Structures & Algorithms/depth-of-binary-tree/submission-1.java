/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        // Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
        // stack.push(new Pair<>(root , 1));
        // int maxDepth = 0;
        
        // while(!stack.isEmpty()){
        //     Pair<TreeNode, Integer> current = stack.pop();
        //     TreeNode node = current.getKey();
        //     int currentDepth = current.getValue();

        //     maxDepth = Math.max(maxDepth, currentDepth);

        //     if(node.left != null){
        //         stack.push(new Pair<>(node.left, currentDepth + 1));
        //     }
        //     if(node.right != null){
        //         stack.push(new Pair<>(node.right, currentDepth + 1));
        //     }

        // }

        // return maxDepth;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);


    }
}

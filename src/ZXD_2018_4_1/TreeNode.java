/**
 * FileName: Tree
 * Author: rbl
 * Date:
 **/
package ZXD_2018_4_1;

import java.util.*;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

//二叉树前序遍历
class Tree1 {

    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        stack.push(curr);
        while (!stack.isEmpty()) {
            curr = stack.pop();
            res.add(curr.val);
            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
        }
        return res;
    }

    public List<Integer> preorderTraversal_digui(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null) return res;
        res.add(root.val);
        preorderTraversal_digui(root.left);
        preorderTraversal_digui(root.right);
        return res;
    }
}

//二叉树中序遍历
class Tree2 {

    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        Stack<TreeNode> stack = new Stack();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }


    public List<Integer> inorderTraversal_digui(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null) return res;
        inorderTraversal_digui(root.left);
        res.add(root.val);
        inorderTraversal_digui(root.right);
        return res;
    }
}

//e二叉树后序遍历
class Tree3 {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        stack.push(curr);
        while (!stack.isEmpty()) {
            curr = stack.pop();
            res.addFirst(curr.val);
            if (curr.left != null) {
                stack.push(curr.left);
            }
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }
        return res;
    }

    public List<Integer> postorderTraversal_digui(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null) return res;
        postorderTraversal_digui(root.left);
        postorderTraversal_digui(root.right);
        res.add(root.val);
        return res;
    }

    //二叉树层序遍历
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> res = new LinkedList();
        LinkedList<TreeNode> level = new LinkedList();
        level.add(root);

        while (level.size() > 0) {
            int size = level.size();
            ArrayList<Integer> curr = new ArrayList();
            for (int a = 0; a < size; ++a) {
                TreeNode t = level.remove();
                curr.add(t.val);
                if (t.left != null) {
                    level.add(t.left);
                }
                if (t.right != null) {
                    level.add(t.right);
                }
            }
            res.add(curr);
        }
        return res;
    }
}



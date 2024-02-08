package com.yugutou.charpter8_tree_hot_problems.level1.topic_双指针;

import com.yugutou.tools.BinaryTree;
import com.yugutou.tools.TreeNode;

/**
 * LeetCode617 合并两个二叉树
 */
public class Merge {
    public static void main(String[] args) {
        BinaryTree bTree1 = new BinaryTree();
        bTree1.root = bTree1.buildBinaryTree();

        BinaryTree bTree2 = new BinaryTree();
        bTree2.root = bTree2.buildBinaryTree();

        TreeNode newTree = mergeTrees(bTree1.root, bTree2.root);
        System.out.println(newTree.val);

    }

    /**
     * LeetCode617 合并两个二叉树
     *
     * @param root1
     * @param root2
     * @return
     */
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1==null)return root2;
        if (root2==null)return root1;
        TreeNode newNode = new TreeNode(root1.val + root2.val);
        newNode.left =mergeTrees(root1.left,root2.left);
        newNode.right =mergeTrees(root1.right,root2.right);
        return newNode;







//        if (t1 == null) {
//            return t2;
//        }
//        if (t2 == null) {
//            return t1;
//        }
//        TreeNode merged = new TreeNode(t1.val + t2.val);
//        merged.left = mergeTrees(t1.left, t2.left);
//        merged.right = mergeTrees(t1.right, t2.right);
//        return merged;
    }

}

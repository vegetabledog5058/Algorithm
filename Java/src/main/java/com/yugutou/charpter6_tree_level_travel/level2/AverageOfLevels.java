package com.yugutou.charpter6_tree_level_travel.level2;


import com.yugutou.tools.BinaryTree;
import com.yugutou.tools.TreeNode;

import java.util.*;

/**
 * LeetCode 515题目要求：
 * 给定一棵二叉树的根节点 root ，请找出该二叉树中每一层的最大值。
 */
public class AverageOfLevels {
    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        bTree.root = bTree.buildBinaryTree();
        List<Double> level = averageOfLevels(bTree.root);
        System.out.println(level.toString());
    }

    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> list = new LinkedList<>();
        list.add(root);
        while (!list.isEmpty()) {
            int size = list.size();
            double sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode polled = list.remove();
                sum += polled.val;
                TreeNode left = polled.left;
                TreeNode right = polled.right;
                if (left != null) list.add(left);
                if (right != null) list.add(right);
            }
            res.add((double) (sum/size));
        }
        return res;

//        list.add(root);
//        while (list.size() != 0) {
//            int len = list.size();
//            double sum = 0;
//            for (int i = 0; i < len; i++) {
//                TreeNode node = list.poll();
//                sum += node.val;
//                if (node.left != null) list.add(node.left);
//                if (node.right != null) list.add(node.right);
//            }
//            res.add(sum / len);
//        }
//        return res;
    }
}


package com.yugutou.charpter6_tree_level_travel.level2;

import com.yugutou.tools.BinaryTree;
import com.yugutou.tools.TreeNode;

import java.util.*;

/**
 * LeetCode103 题，
 * 给定一个二叉树，返回其节点值的锯齿形层序遍历。
 * （即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）
 */
public class ZigzagLevelOrder {
    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        bTree.root = bTree.buildBinaryTree();
        List<List<Integer>> level = zigzagLevelOrder(bTree.root);
        findBottomLeftValue(bTree.root);
        System.out.println(level.toString());
    }

    public static int findBottomLeftValue(TreeNode root) {

        if (root.left == null && root.right == null) {
            return root.val;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode node = null;
        while (!queue.isEmpty()) {
            node = queue.remove();
            TreeNode right = node.right, left = node.left;

            if (right != null) {
                // 先把右节点加入 queue
                queue.offer(node.right);
            }
            if (left != null) {
                // 再把左节点加入 queue
                queue.offer(node.left);
            }
        }

        return node.val;
    }


    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode node=null;
        while (!queue.isEmpty()) {
            node = queue.remove();
            TreeNode right = node.right,
                    left = node.left;

            if (right != null) {
                queue.add(right);
//                }
                if (left != null) {
                    queue.offer(left);
                }
            }
        }



//
//        boolean flag = true;
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//
//            Deque<Integer> tem = new LinkedList<>();
//
//            for (int i = 0; i < size; i++) {
//                TreeNode polled = queue.poll();
//                if (flag){
//                    tem.addLast(polled.val);
//                }else {
//                    tem.addFirst(polled.val);
//                }
//                TreeNode right = polled.right, left = polled.left;
//                if (left != null) {
//                    queue.add(left);
//                }
//                if (right != null) {
//                    queue.add(right);
//                }
//            }
//            res.add(new LinkedList<>(tem));
//            flag=!flag;
//        }
            return res;
        }

//        List<List<Integer>> ans = new LinkedList<List<Integer>>();
//        if (root == null) {
//            return ans;
//        }
//        Queue<TreeNode> queue = new LinkedList<TreeNode>();
//        queue.offer(root);
//        boolean isOrderLeft = true;
//        while (!queue.isEmpty()) {
//            Deque<Integer> levelList = new LinkedList<Integer>();
//            int size = queue.size();
//            for (int i = 0; i < size; ++i) {
//                TreeNode curNode = queue.poll();
//                if (isOrderLeft) {
//                    levelList.offerLast(curNode.val);
//                } else {
//                    levelList.offerFirst(curNode.val);
//                }
//                if (curNode.left != null) {
//                    queue.offer(curNode.left);
//                }
//                if (curNode.right != null) {
//                    queue.offer(curNode.right);
//                }
//            }
//            ans.add(new LinkedList<Integer>(levelList));
//            isOrderLeft = !isOrderLeft;
////        }
//        return ans;
//    }
    }


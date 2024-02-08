package com.yugutou.charpter6_tree_level_travel.level2;

import com.yugutou.tools.BinaryTree;
import com.yugutou.tools.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SimpleLevelOrder {
    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        bTree.root = bTree.buildBinaryTree();
        List<Integer> level = simpleLevelOrder(bTree.root);
        System.out.println(level.toString());
    }

    public static List<Integer> simpleLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        //定义存储数组
        List<Integer> res = new ArrayList<>();
        //定义队列
        LinkedList<TreeNode> queue = new LinkedList<>();
        //此时队列为空,将根节点加入队列
        queue.add(root);
        while (!queue.isEmpty()) {
            //每次循环移除队列的第一个元素
            TreeNode node = queue.remove();
            res.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return res;


//        if (root == null) {
//            return new ArrayList<Integer>();
//        }
//
//        List<Integer> res = new ArrayList<Integer>();
//        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
//        //将根节点放入队列中，然后不断遍历队列
//        queue.add(root);
//        //有多少元素执行多少次
//        while (queue.size() > 0) {
//            //获取当前队列的长度，这个长度相当于 当前这一层的节点个数
//            TreeNode t = queue.remove();
//            res.add(t.val);
//            if (t.left != null) {
//                queue.add(t.left);
//            }
//            if (t.right != null) {
//                queue.add(t.right);
//            }
//        }
//        return res;
//    }
    }
}

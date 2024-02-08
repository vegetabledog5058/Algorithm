package com.yugutou.charpter6_tree_level_travel.level2;

import com.yugutou.charpter13_math.level1.TrailingZeroes;

import java.util.*;

/**
 * LeetCode429
 * 给定一个 N 叉树，返回其节点值的层序遍历。
 * （即从左到右，逐层遍历）。
 */
public class NLevelOrder {
    public static void main(String[] args) {
        NTreeNode nTreeNode = NTreeNode.buildBinaryTree();
        System.out.println(nLevelOrder(nTreeNode));

    }

    public static List<List<Integer>> nLevelOrder(NTreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Deque<NTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Deque<NTreeNode> next = new ArrayDeque<>();
            List<Integer> tem = new LinkedList<>();
            while (!queue.isEmpty()) {

                NTreeNode poll = queue.poll();
                tem.add(poll.val);
                for (NTreeNode child : poll.children) {
                    if (child != null) next.add(child);
                }
            }
            queue=next;
            res.add(tem);


        }
        return res;
//
//        List<List<Integer>> value = new ArrayList<>();
//        Deque<NTreeNode> q = new ArrayDeque<>();
//        if (root != null)
//            q.addLast(root);
//        while (!q.isEmpty()) {
//            Deque<NTreeNode> next = new ArrayDeque<>();
//            List<Integer> nd = new ArrayList<>();
//            while (!q.isEmpty()) {
//                NTreeNode cur = q.pollFirst();
//                nd.add(cur.val);
//                for (NTreeNode chd : cur.children) {
//                    if (chd != null)
//                        next.add(chd);
//                }
//            }
//            q = next;
//            value.add(nd);
//        }
//        return value;
//    }

    }
}
    class NTreeNode {
        public int val;
        public List<NTreeNode> children;


        public NTreeNode(int val, List<NTreeNode> children) {
            this.val = val;
            this.children = children;
        }


        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }


        public static NTreeNode buildBinaryTree() {
            List<NTreeNode> list11 = new ArrayList<>();
            List<NTreeNode> list12 = new ArrayList<>();
            List<NTreeNode> list13 = new ArrayList<>();
            List<NTreeNode> list14 = new ArrayList<>();

            List<NTreeNode> list3 = new ArrayList<>();
            list3.add(new NTreeNode(5, list11));
            list3.add(new NTreeNode(6, list12));
            NTreeNode nTreeNode3 = new NTreeNode(3, list3);

            List<NTreeNode> list1 = new ArrayList<>();
            list1.add(nTreeNode3);
            list1.add(new NTreeNode(2, list13));
            list1.add(new NTreeNode(4, list14));

            NTreeNode nTreeNode = new NTreeNode(1, list1);
            return nTreeNode;

        }

    }

package com.yugutou.charpter1_linklist.level2.topic2_4双指针;

/**
 * 寻找链表倒数第K个结点
 */
public class GetKthFromEnd {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        ListNode nodeA = initLinkedList(a);
//        while (nodeA!=null){
//            System.out.println(nodeA.val);
//            nodeA = nodeA.next;
//        }
        ListNode node = getKthFromEnd(nodeA,2);
      //  System.out.println(node.val);
//        ListNode node1 = middleNode(node);
//        System.out.println(node1.val);

    }

    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        while (k>0&&fast != null ) {
            k--;
            fast = fast.next;

        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }


    private static ListNode initLinkedList(int[] array) {
        ListNode head = null, cur = null;

        for (int i = 0; i < array.length; i++) {
            ListNode newNode = new ListNode(array[i]);
            newNode.next = null;
            if (i == 0) {
                head = newNode;
                cur = head;
            } else {
                cur.next = newNode;
                cur = newNode;
            }
        }
        return head;
    }
    public static ListNode middleNode(ListNode head) {

        ListNode fast =head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    static class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

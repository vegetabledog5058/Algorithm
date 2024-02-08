package com.yugutou.charpter5_queue_map.level2;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> queue1;
    int n ;


    public MyStack() {

        queue1 = new LinkedList<>();

    }

    public void push(int x) {
        queue1.add(x);
        for (int i = 0; i <n; i++) {
            queue1.add(queue1.remove());
        }
        n++;
    }

    public int pop() {
        n--;
     return queue1.remove();
    }

    public int top() {
        if (queue1.isEmpty()){
            return -1;
        }
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }



//    public MyStack() {
//        queue1 = new LinkedList<Integer>();
//        queue2 = new LinkedList<Integer>();
//    }

//    public void push(int x) {
//        queue2.offer(x);
//        while (!queue1.isEmpty()) {
//            queue2.offer(queue1.poll());
//        }
//        Queue<Integer> temp = queue1;
//        queue1 = queue2;
//        queue2 = temp;
//    }
//
//    public int pop() {
//        return queue1.poll();
//    }
//
//    public int top() {
//        return queue1.peek();
//    }
//
//    public boolean empty() {
//        return queue1.isEmpty();
//    }
}
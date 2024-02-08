package com.yugutou.charpter5_queue_map.level2;

import java.util.Deque;
import java.util.LinkedList;

class MyQueue {
    Deque<Integer> inStack;
    Deque<Integer> outStack;

    public MyQueue(){
        inStack = new LinkedList<>();
        outStack= new LinkedList<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if (outStack.isEmpty()){
            while (inStack.iterator().hasNext()){
                outStack.push(inStack.pop());
            }
        }
        if (empty()){
            return -1;
        }
        return outStack.pop();

    }

    public int peek() {
        if (empty()) {
            return -1;
        }
        if (outStack.isEmpty()){
            while (inStack.iterator().hasNext()){
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }

    public boolean empty() {
        return outStack.isEmpty()&&inStack.isEmpty();
    }







  /*  public MyQueue() {
        inStack = new LinkedList<Integer>();
        outStack = new LinkedList<Integer>();
    }
    public void push(int x) {
        inStack.push(x);
    }
    public int pop() {
        if (outStack.isEmpty()) {
            in2out();
        }
        return outStack.pop();
    }
    public int peek() {
        if (outStack.isEmpty()) {
            in2out();
        }
        return outStack.peek();
    }
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
    private void in2out() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }*/
}

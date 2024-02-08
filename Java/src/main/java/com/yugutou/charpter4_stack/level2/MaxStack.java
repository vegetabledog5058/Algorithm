package com.yugutou.charpter4_stack.level2;

import java.util.LinkedList;
import java.util.Stack;

class MaxStack {
    Stack<Integer> stack;
    Stack<Integer> maxStack;

    public MaxStack() {
        stack = new Stack();
        maxStack = new Stack();
        stack.push(Integer.MIN_VALUE);
    }

    public void push(int x) {
        int max = stack.peek()< x ?x :stack.peek() ;
        maxStack.push(x);
        stack.push(max);
    }

    public int pop() {
        stack.pop();
       return maxStack.pop();
    }

    public int top() {
        return maxStack.peek();
    }

    public int peekMax() {
        return stack.peek();
    }

    public int popMax() {

        Stack<Integer> buffer = new Stack<>();
        int max = peekMax();
        while (top()!=max){
            buffer.push(pop());
        }
        pop();
        while (!buffer.isEmpty()){
            push(buffer.pop());
        }
        return max;
    }





















//    public void push(int x) {
//        int max = maxStack.isEmpty() ? x : maxStack.peek();
//        maxStack.push(max > x ? max : x);
//        stack.push(x);
//    }
//
//    public int pop() {
//        maxStack.pop();
//        return stack.pop();
//    }
//
//    public int top() {
//        return stack.peek();
//    }
//
//    public int peekMax() {
//        return maxStack.peek();
//    }
//
//    public int popMax() {
//        int max = peekMax();
//        Stack<Integer> buffer = new Stack();
//        while (top() != max) buffer.push(pop());
//        pop();
//        while (!buffer.isEmpty()) push(buffer.pop());
//        return max;
//    }
}
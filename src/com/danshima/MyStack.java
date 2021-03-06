package com.danshima;

import java.util.EmptyStackException;

/**
 * Implement a simple stack (last in first out)
 */

public class MyStack<T> {
    private static class StackNode<T>{
        private T data;
        private StackNode<T> next;
        public StackNode(T data){
            this.data = data;
        }
    }

    private StackNode<T> top;

    /**
     * remove the top item from the stack
     */
    public T pop(){
        if(top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }

    /**
     * add an item to the top of the stack
     * @param item
     */
    public void push(T item){
        StackNode<T> t = new StackNode<>(item);
        t.next = top;
        top = t;
    }

    /**
     * return the top of the stack
     * @return
     */
    public T peek(){
        if(top == null) throw new EmptyStackException();
        return top.data;
    }

    /**
     * return true if the stack is empty
     * @return
     */
    public boolean isEmpty(){
        return top == null;
    }

}

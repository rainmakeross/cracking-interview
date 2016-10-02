package com.rainmaker.interviewprep.cracking.common;


import java.util.Stack;

public class MyQueue<E> {
        Stack<E> inbox = new Stack<E>();
        Stack<E> outbox = new Stack<E>();

        public void enqueue(E element) {
            inbox.push(element);
        }

        public E dequeue(){
            if(outbox.empty()) {
                while(!inbox.empty()) {
                    outbox.push(inbox.pop());
                }
            }
            return outbox.pop();
        }

        public E peek() {
            if(outbox.empty()) {
                while(!inbox.empty()) {
                    outbox.push(inbox.pop());
                }
            }
            return outbox.peek();
        }
}

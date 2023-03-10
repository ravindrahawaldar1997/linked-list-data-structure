package com.bridgelabz.stacks_and_queues;


import com.bridgelabz.linked_list.INode;
import com.bridgelabz.linked_list.MyLinkedList;

public class MyStack {
    MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

    public void push(INode element) {
        myLinkedList.add(element);
    }

    public void printStack() {
        myLinkedList.printMyNodes();
    }
}

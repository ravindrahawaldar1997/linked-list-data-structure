package com.bridgelabz.stacks_and_queues;

import com.bridgelabz.linked_list.MyNode;

public class MyQueueList {
    public static void main(String[] args) {
        MyStack myQueueList = new MyStack();
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);

        myQueueList.pushQueue(firstNode);
        myQueueList.pushQueue(secondNode);
        myQueueList.pushQueue(thirdNode);

        myQueueList.printStack();
    }
}

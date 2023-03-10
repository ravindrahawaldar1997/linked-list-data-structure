package com.bridgelabz.stacks_and_queues;
import com.bridgelabz.linked_list.INode;
import com.bridgelabz.linked_list.MyNode;
public class StackList<K> {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        MyNode<Integer> firstNode = new MyNode<>(70);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(56);
        myStack.push(firstNode);
        myStack.push(secondNode);
        myStack.push(thirdNode);

        INode topNode = myStack.peak();
        System.out.println("Top most node " +topNode.getKey());
        myStack.pop();

        myStack.printStack();


    }
}

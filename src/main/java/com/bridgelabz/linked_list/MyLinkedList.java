package com.bridgelabz.linked_list;

public class MyLinkedList<T> {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {

        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            head.setNext(tempNode);
        }
    }

    public void append(INode myNode) {
        if (this.tail == null) {
            this.tail = myNode;
        }
        if (this.head == null) {
            this.head = myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    public void insertNode(INode newNode) {
        INode tempNode = this.head.getNext();
        this.head.setNext(newNode);
        newNode.setNext(tail);
    }

    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My nodes ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    public INode popFirstElement() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public INode popLastElement() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        INode deletedNode = tempNode.getNext();
        tempNode.setNext(null);
        return deletedNode;
    }

    public void searchNode(INode searchNode) {
        INode tempNode = head;
        while (!tempNode.getNext().equals(null)) {
            if (tempNode.getKey().equals(searchNode.getKey())) {
                System.out.println("Searched value of  key is = " + tempNode.getKey());
                break;
            }
            tempNode = tempNode.getNext();
        }
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(firstNode);
        myLinkedList.append(thirdNode);
        myLinkedList.insertNode(secondNode);

        myLinkedList.searchNode(secondNode);


        myLinkedList.printMyNodes();

    }
}
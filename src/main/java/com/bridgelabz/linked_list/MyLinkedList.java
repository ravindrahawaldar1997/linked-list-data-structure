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

    public void insertAfter(INode previousNode, INode newNode) {
        INode tempNode = previousNode.getNext();
        previousNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode deleteAfter(INode previousNode, INode deleteNode) {
        INode tempNode = deleteNode.getNext();
        previousNode.setNext(tempNode);
        tempNode.setNext(null);
        return tempNode;
    }

    public void appendSort(INode previousNode, INode newNode) {
        if ((int) previousNode.getKey() < (int) newNode.getKey()) {
            this.tail.setNext(newNode);
            this.tail = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
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

    public void sort() {
        INode tempNode = head;
        while (tempNode != null) {
            INode nextNode = tempNode.getNext();
            while (nextNode != null) {
                if ((Integer) tempNode.getKey() > (Integer) nextNode.getKey()) {
                    Integer temp = (Integer) tempNode.getKey();
                    tempNode.setKey(nextNode.getKey());
                    nextNode.setKey(temp);
                }
                nextNode = nextNode.getNext();
            }
            tempNode = tempNode.getNext();
        }
    }

    public static void main(String[] args) {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(firstNode);
        myLinkedList.append(thirdNode);
        myLinkedList.insertNode(secondNode);

        myLinkedList.searchNode(secondNode);

        MyNode<Integer> newNode = new MyNode<>(40);
        myLinkedList.insertAfter(secondNode, newNode);
        myLinkedList.deleteAfter(secondNode, newNode);

        myLinkedList.sort();

        myLinkedList.printMyNodes();

    }
}
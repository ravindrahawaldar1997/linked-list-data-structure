package com.bridgelabz.linked_list;

public class MyNode<K> {
    public MyNode() {
        this.key = null;
        this.next = null;
    }

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }
    private MyNode next;
    private K key;

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public static <K> void add(){
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        if (myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode)) {
            System.out.println("Condition is " +true);
        }else{
            System.out.println("Condition is " +false);
        }
    }

    public static void main(String[] args) {
        add();
    }
}

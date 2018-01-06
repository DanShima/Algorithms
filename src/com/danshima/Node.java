package com.danshima;

import java.util.ArrayList;
import java.util.List;

public class Node {
    protected int data;
    protected Node next = null;
    protected boolean visited;
    protected List<Node> neighbours;

    Node(int data)
    {
        this.data = data;
        this.neighbours=new ArrayList<>();

    }
    public void addneighbours(Node neighbourNode)
    {
        this.neighbours.add(neighbourNode);
    }
    public List<Node> getNeighbours() {
        return neighbours;
    }
    public void setNeighbours(List<Node> neighbours) {
        this.neighbours = neighbours;
    }

    public Node deleteNode(Node head, int data){
        Node node = head;
        if(node.data == data){
            return head.next; //moved head
        }
        while(node.next != null){
            if(node.next.data == data){
                node.next = node.next.next;
                return head; //head didn't change
            }
            node = node.next;
        }
        return head;
    }

    //singly linked list
    public void appendToTail(int data){
        Node end = new Node(data);
        Node node = this;
        while(node.next != null){
            node = node.next;
        }
        node.next = end;
    }
}

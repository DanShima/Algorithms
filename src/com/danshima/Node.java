package com.danshima;

import java.util.ArrayList;
import java.util.List;

public class Node {
    protected int data;
    protected boolean visited;
    protected List<Node> neighbours;

    Node(int data)
    {
        this.data=data;
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
}

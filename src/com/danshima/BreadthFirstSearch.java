package com.danshima;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * start with the first node A, then visit neighbors of A, then neighbors of neighbors of A etc.
 * use queue to traverse graph
 * Only difference with respect to binary tree is that we need to track if node have been visited before or not.
 * If node have been already visited then we won’t visit it again.
 * Step 1: create empty queue and push root node to it
 * Step 2: pop a node from queue, find neighbors, check for visited or not
 * Step 3: push neighbors of node into queue if not null
 */

public class BreadthFirstSearch {
    private Queue<Node> queue;
    static ArrayList<Node> nodes = new ArrayList<>();

    public BreadthFirstSearch() {
        queue = new LinkedList<Node>();
    }

    /**
     * find neighbors of node using adjacency matrix
     * if adjacency_matrix[i][j]==1, then nodes at index i and index j are connected
     */
    public ArrayList<Node> findNeighbours(int adjacency_matrix[][],Node node) {
        int nodeIndex = -1;

        ArrayList<Node> neighbours = new ArrayList<>();
        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).equals(node)) {
                nodeIndex = i;
                break;
            }
        }

        if (nodeIndex != -1) {
            for (int j = 0; j < adjacency_matrix[nodeIndex].length; j++) {
                if (adjacency_matrix[nodeIndex][j] == 1) {
                    neighbours.add(nodes.get(j));
                }
            }
        }
        return neighbours;
    }
    //using adjacency matrix
    public void bfs(int adjacency_matrix[][], Node node) {
        queue.add(node);
        node.visited = true;
        while (!queue.isEmpty()) {

            Node element = queue.remove();
            System.out.print(element.data + " - ");
            ArrayList<Node> neighbours = findNeighbours(adjacency_matrix, element);
            for (int i = 0; i < neighbours.size(); i++) {
                Node n = neighbours.get(i);
                if (n != null && !n.visited) {
                    queue.add(n);
                    n.visited = true;

                }
            }

        }
    }
    //using neighbors list
    public void bfs(Node node) {
        queue.add(node);
        node.visited = true;
        while (!queue.isEmpty()) {

            Node element = queue.remove();
            System.out.print(element.data + " ");
            List<Node> neighbors = element.getNeighbours();
            for (int i = 0; i < neighbors.size(); i++) {
                Node n = neighbors.get(i);
                if (n != null && !n.visited) {
                    queue.add(n);
                    n.visited = true;

                }
            }
        }


    }

    public static void main(String arg[])
    {

        Node node40 =new Node(40);
        Node node10 =new Node(10);
        Node node20 =new Node(20);
        Node node30 =new Node(30);
        Node node60 =new Node(60);
        Node node50 =new Node(50);
        Node node70 =new Node(70);

        node40.addneighbours(node10);
        node40.addneighbours(node20);
        node10.addneighbours(node30);
        node20.addneighbours(node10);
        node20.addneighbours(node30);
        node20.addneighbours(node60);
        node20.addneighbours(node50);
        node30.addneighbours(node60);
        node60.addneighbours(node70);
        node50.addneighbours(node70);

        nodes.add(node40);
        nodes.add(node10);
        nodes.add(node20);
        nodes.add(node30);
        nodes.add(node60);
        nodes.add(node50);
        nodes.add(node70);
        int adjacency_matrix[][] = {
                {0,1,1,0,0,0,0}, // Node 1: 40
                {0,0,0,1,0,0,0}, // Node 2 :10
                {0,1,0,1,1,1,0}, // Node 3: 20
                {0,0,0,0,1,0,0}, // Node 4: 30
                {0,0,0,0,0,0,1}, // Node 5: 60
                {0,0,0,0,0,0,1}, // Node 6: 50
                {0,0,0,0,0,0,0}, // Node 7: 70
        };

        System.out.println("The BFS traversal of the graph is ");
        BreadthFirstSearch bfsExample = new BreadthFirstSearch();
       // bfsExample.bfs(adjacency_matrix, node40);
        bfsExample.bfs(node40);

    }


}

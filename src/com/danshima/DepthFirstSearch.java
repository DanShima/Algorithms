package com.danshima;

import java.util.List;
import java.util.Stack;

/**
 * In DFS,  You start with  an un-visited node and start picking an adjacent node, until you have no choice,
 * then you backtrack until you have another choice to pick a node, if not, you select another un-visited node.
 *
 *Step 1: Push the root node in the Stack.
 *Step 2: Loop until stack is empty.
 *Step 3: Peek the node of the stack.
 *Step 4: If the node has unvisited child nodes, get the unvisited child node, mark it as traversed and push it on stack.
 *Step 5: If the node does not have any unvisited child nodes, pop the node from the stack.
 */

public class DepthFirstSearch {

    /**
     * iterative approach.
      * @param node
     */
  public static void deepFirstSearchUsingStack(Node node) {
      Stack<Node> stack=new  Stack<Node>();
      stack.add(node);
      node.visited=true;
      while (!stack.isEmpty())
      {
          Node element=stack.pop();
          System.out.print(element.data + " ");

          List<Node> neighbours=element.getNeighbours();
          for (int i = 0; i < neighbours.size(); i++) {
              Node n = neighbours.get(i);
              if(n!=null && !n.visited)
              {
                  stack.add(n);
                  n.visited=true;

              }
          }
      }
  }

    /**
     * Recursive approach with no use of stack
     */
    public  void dfs(Node node)
    {
        System.out.print(node.data + " ");
        List<Node> neighbours = node.getNeighbours();
        node.visited=true;
        for (int i = 0; i < neighbours.size(); i++) {
            Node n = neighbours.get(i);
            if(n!=null && !n.visited)
            {
                dfs(n);
            }
        }
    }

    public static void main(String arg[]){
        Node node40 =new Node(40);
        Node node10 =new Node(10);
        Node node20 =new Node(20);
        Node node60 =new Node(60);
        Node node50 =new Node(50);
        node40.addneighbours(node10);
        node40.addneighbours(node20);
        node20.addneighbours(node10);
        node20.addneighbours(node60);
        node20.addneighbours(node50);
        DepthFirstSearch dfsExample = new DepthFirstSearch();
        System.out.println("The DFS traversal of the graph using stack ");
        dfsExample.deepFirstSearchUsingStack(node40);
        System.out.println();
        // Resetting the visited flag for nodes
        node40.visited=false;
        node10.visited=false;
        node20.visited=false;
        node60.visited=false;
        node50.visited=false;
        System.out.println("The DFS traversal of the graph using recursion ");
        dfsExample.dfs(node40);
    }


}

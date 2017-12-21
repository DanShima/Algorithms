package com.danshima;

/**
 * Representations of a graph, with 6 vertices indexed 0-5, as an edge list,
 * adjacency matrix and adjacency list.
 */

public class GraphsRepresentation {
    public static int[][] edgeList = {
            {0, 2},
            {1, 3},
            {2, 3},
            {2, 4},
            {3, 5},
            {4, 5}
    };

    public static int[][] adjacencyMatrix = {
            {0, 0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 1, 0},
            {0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 0}
    };

    public static int[][] adjacencyList = {
            {2},
            {3},
            {3, 4},
            {5},
            {5},
            {}
    };

}

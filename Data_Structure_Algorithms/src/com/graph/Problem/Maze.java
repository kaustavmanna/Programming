/**/

package com.graph.Problem;

import com.graph.AdjMatrixGraph;

public class Maze
{
    public static void main(String[] args)
    {
        AdjMatrixGraph mazegraph = new AdjMatrixGraph(16);
        mazegraph.addEdge(1,2);
        mazegraph.addEdge(1,5);
        mazegraph.addEdge(2,3);
        mazegraph.addEdge(2,6);
        mazegraph.addEdge(3,4);
        mazegraph.addEdge(3,7);
        mazegraph.addEdge(4,8);
        mazegraph.addEdge(5,6);
        mazegraph.addEdge(5,9);
        mazegraph.addEdge(6,7);
        mazegraph.addEdge(6,10);
        mazegraph.addEdge(7,8);
        mazegraph.addEdge(7,11);
        mazegraph.addEdge(8,12);
        mazegraph.addEdge(9,10);
        mazegraph.addEdge(9,13);
        mazegraph.addEdge(10,11);
        mazegraph.addEdge(10,14);
        mazegraph.addEdge(11,12);
        mazegraph.addEdge(11,15);
        mazegraph.addEdge(12,16);
        mazegraph.addEdge(13,14);
        mazegraph.addEdge(14,15);
        mazegraph.addEdge(15,16);

        mazegraph.DFS(13);
    }
}

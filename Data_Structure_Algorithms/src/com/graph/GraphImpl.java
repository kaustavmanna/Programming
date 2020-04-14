/**
 * @author kaustavmanna
 *
 */

package com.graph;

public class GraphImpl
{
	public static void main(String[] args)
	{
		Graph graph = new AdjMatrixGraph(5);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(1, 5);

		graph.BFS(1);
		graph.DFS(1);
	}
}

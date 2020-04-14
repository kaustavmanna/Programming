/**
 * @author kaustavmanna
 *
 */

package com.graph;

public interface Graph
{
	void addEdge(int vertex_1, int vertex_2);
	void removeEdge(int vertex_1, int vertex_2);
	boolean isEdge(int source_v, int target_v);
	void BFS(int v);
	void DFS(int v);
}

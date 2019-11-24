/**
 * @author kaustavmanna
 *
 */

package com.graph;

public interface Graph
{
	public void addEdge(int vertex_1, int vertex_2);
	public void removeEdge(int vertex_1, int vertex_2);
	public boolean isEdge(int source_v, int target_v);
}

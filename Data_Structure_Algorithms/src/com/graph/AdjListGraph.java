/**
 * @author kaustavmanna
 *
 */

package com.graph;

import java.util.LinkedList;

public class AdjListGraph implements Graph
{
	private LinkedList<Integer> adjlist[];
	
	@SuppressWarnings("unchecked")
	public AdjListGraph(int vertex)
	{
		adjlist = new LinkedList[vertex];
		
		for(int i = 0; i < vertex; i++)
			adjlist[i] = new LinkedList<Integer>();
	}

	@Override
	public void addEdge(int vertex_1, int vertex_2)
	{
		adjlist[vertex_1 - 1].add(vertex_2);
		adjlist[vertex_2 - 1].add(vertex_1);
	}

	@Override
	public void removeEdge(int vertex_1, int vertex_2)
	{
		Integer vertex = vertex_2;
		adjlist[vertex_1 - 1].remove(vertex);
		
		vertex = vertex_1;
		adjlist[vertex_2 - 1].remove(vertex);
	}

	@Override
	public boolean isEdge(int source_v, int target_v)
	{
		Integer vertex = target_v;
		
		if(adjlist[source_v - 1].contains(vertex))
			return true;
		else
			return false;
	}
}

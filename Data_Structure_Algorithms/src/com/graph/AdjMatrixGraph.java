/**
 * @author kaustavmanna
 *
 */

package com.graph;

public class AdjMatrixGraph implements Graph
{
	private boolean adjmatrix[][];
	private int vertex;
	
	public AdjMatrixGraph(int vertex)
	{
		this.vertex = vertex;
		adjmatrix = new boolean[vertex][vertex];
	}
	
	@Override
	public void addEdge(int vertex_1, int vertex_2)
	{
		if(vertex_1 >= 0 && vertex_1 < vertex && vertex_2 > 0 && vertex_2 < vertex)
		{
			adjmatrix[vertex_1][vertex_2] = true;
			adjmatrix[vertex_2][vertex_1] = true;
		}	
	}
	
	@Override
	public void removeEdge(int vertex_1, int vertex_2)
	{
		if(vertex_1 >= 0 && vertex_1 < vertex && vertex_2 > 0 && vertex_2 < vertex)
		{
			adjmatrix[vertex_1][vertex_2] = false;
			adjmatrix[vertex_2][vertex_1] = false;
		}
	}
	
	@Override
	public boolean isEdge(int vertex_1, int vertex_2)
	{
		if(vertex_1 >= 0 && vertex_1 < vertex && vertex_2 > 0 && vertex_2 < vertex)
			return adjmatrix[vertex_1][vertex_2];
		else
			return false;
	}
}

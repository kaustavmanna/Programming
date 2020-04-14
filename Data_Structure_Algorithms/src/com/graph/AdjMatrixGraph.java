/**
 * @author kaustavmanna
 *
 */

package com.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class AdjMatrixGraph implements Graph
{
	private boolean[][] adjmatrix;
	private int vertex;
	
	public AdjMatrixGraph(int vertex)
	{
		this.vertex = vertex;
		adjmatrix = new boolean[vertex][vertex];
	}
	
	@Override
	public void addEdge(int vertex_1, int vertex_2)
	{
		if(vertex_1 > 0 && vertex_1 <= vertex && vertex_2 > 0 && vertex_2 <= vertex)
		{
			adjmatrix[vertex_1-1][vertex_2-1] = true;
			adjmatrix[vertex_2-1][vertex_1-1] = true;
		}	
	}
	
	@Override
	public void removeEdge(int vertex_1, int vertex_2)
	{
		if(vertex_1 > 0 && vertex_1 <= vertex && vertex_2 > 0 && vertex_2 <= vertex)
		{
			adjmatrix[vertex_1-1][vertex_2-1] = false;
			adjmatrix[vertex_2-1][vertex_1-1] = false;
		}
	}
	
	@Override
	public boolean isEdge(int vertex_1, int vertex_2)
	{
		if(vertex_1 > 0 && vertex_1 <= vertex && vertex_2 > 0 && vertex_2 <= vertex)
			return adjmatrix[vertex_1-1][vertex_2-1];
		else
			return false;
	}

	@Override
	public void BFS(int v)
	{
		boolean visited[] = new boolean[vertex];
		for(int i = 0; i < vertex; i++)
			visited[i] = false;

		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(v);
		visited[v-1] = true;

		System.out.println("BFS traversal of the graph is:");

		while(queue.size() != 0)
		{
			v = queue.poll();
			System.out.print(v + " ");
			for(int i = 0; i < vertex; i++)
			{
				if(visited[i] == false && adjmatrix[v-1][i] == true)
				{
					visited[i] = true;
					queue.add(i+1);
				}
			}
		}
		System.out.println();
	}

	@Override
	public void DFS(int v)
	{
		System.out.println("DFS traversal of the graph is:");
		boolean visited[] = new boolean[vertex];
		for(int i = 0; i < vertex; i++)
			visited[i] = false;
		DFSutil(visited, v);
		System.out.println();
	}

	private void DFSutil(boolean visited[], int v)
	{
		visited[v-1] = true;
		System.out.print(v + " ");

		for(int i = 0; i < vertex; i++)
		{
			if(visited[i] == false && adjmatrix[v-1][i] == true)
				DFSutil(visited, i+1);
		}
	}
}

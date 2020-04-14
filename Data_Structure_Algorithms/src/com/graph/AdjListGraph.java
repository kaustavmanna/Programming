/**
 * @author kaustavmanna
 *
 */

package com.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class AdjListGraph implements Graph
{
	private LinkedList<Integer> adjlist[];
	private int vertex;

	public AdjListGraph(int vertex)
	{
		this.vertex = vertex;
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
			Iterator<Integer> i = adjlist[v-1].iterator();
			while(i.hasNext())
			{
				int n = i.next();
				if(!visited[n-1])
				{
					visited[n-1] = true;
					queue.add(n);
				}
			}
		}
		System.out.println();
	}

	@Override
	public void DFS(int v)
	{
		System.out.println("DFS Traversal of the graph is:");
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
		Iterator<Integer> itr = adjlist[v-1].iterator();
		while(itr.hasNext())
		{
			int n = itr.next();
			if(!visited[n])
				DFSutil(visited, n);
		}
	}
}

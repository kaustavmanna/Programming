/**
 * @author kaustavmanna
 *
 */

package com.heap;

public interface Heap
{
	public boolean isEmpty();
	public Integer getTop();
	public void insert(Integer data);
	public Integer removeTop();
}
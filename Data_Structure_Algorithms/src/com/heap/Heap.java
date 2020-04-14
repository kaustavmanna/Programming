/**
 * @author kaustavmanna
 *
 */

package com.heap;

public interface Heap
{
	boolean isEmpty();
	Integer getTop();
	void insert(Integer data);
	Integer removeTop();
}
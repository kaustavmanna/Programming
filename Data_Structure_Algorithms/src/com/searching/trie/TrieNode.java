/**
 * @author kaustavmanna
 *
 */

package com.searching.trie;

import java.util.*;

public class TrieNode
{
	private char content;
	private boolean iswordcheck;
	private LinkedList<TrieNode> child;
	
	public TrieNode(char content)
	{
		this.content = content;
		this.iswordcheck = false;
		child = new LinkedList<TrieNode>();
	}
	
	public char getChar()
	{
		return this.content;
	}
	
	public boolean isWord()
	{
		return this.iswordcheck;
	}
	
	public LinkedList<TrieNode> getChild()
	{
		return this.child;
	}
	
	public void setIsWord(boolean iswordcheck)
	{
		this.iswordcheck = iswordcheck;
	}
}

package com.searching.trie;

import java.util.LinkedList;

/**
 * @author kaustavmanna
 *
 */
public class Trie
{
	private TrieNode root;
	
	public Trie()
	{
		root = new TrieNode(' ');
	}
	
	public void InsertInTrie(String word)
	{
		TrieNode crawl = root;
		
		for(int i = 0; i < word.length(); i++)
		{
			char c = word.charAt(i);
			LinkedList<TrieNode> child = crawl.getChild();
			
			boolean found = false;
			if(!child.isEmpty())
			{
				for(int j = 0; j < child.size(); j++)
				{
					if(child.get(j).getChar() == c)
					{
						found = true;
						crawl = child.get(j);
						break;
					}
				}
			}
			
			if(found == false || child.isEmpty())
			{
				TrieNode node = new TrieNode(c);
				child.add(node);
				crawl = node;
			}
			
			if(i == word.length() -1)
			{
				crawl.setIsWord(true);
				System.out.println(word + " is added to the Dictionary successfully!");
			}
		}
	}
	
	public void SearchInTrie(String word)
	{
		TrieNode crawl = root;
		boolean found = false;
		
		for(int i = 0; i < word.length(); i++)
		{
			char c = word.charAt(i);
			LinkedList<TrieNode> child = crawl.getChild();
			
			if(child.isEmpty())
			{
				break;
			}
			else
			{
				found = false;
				for(int j = 0; j < child.size(); j++)
				{
					if(child.get(j).getChar() == c)
					{
						crawl = child.get(j);
						found = true;
						break;
					}
				}
			}
		}
		
		if(crawl.isWord() && found)
			System.out.println("\"" + word + "\" exists in the dictionary!");
		else
			System.out.println("\"" + word + "\" does not exist in the dictionary!");
	}
}

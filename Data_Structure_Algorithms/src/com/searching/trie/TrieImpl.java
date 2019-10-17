package com.searching.trie;

/**
 * @author kaustavmanna
 *
 */
public class TrieImpl
{
	public static void main(String[] args)
	{
		Trie dictionary = new Trie();
		dictionary.InsertInTrie("Computer");
		dictionary.InsertInTrie("Compute");
		dictionary.InsertInTrie("Kaustav");
		dictionary.SearchInTrie("Compute");
		dictionary.SearchInTrie("Kaustav");
		dictionary.SearchInTrie("Compu");
	}
}

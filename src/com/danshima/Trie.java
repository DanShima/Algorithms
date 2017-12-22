package com.danshima;

/**
 * Good for dictionary
 * searching contact in mobile phone book
 * word games (connect letters horizontally, vertically or diagonally) <-- checking a sequence
 * requires much more memory than trees and lists.
 *
 */

public class Trie {
    private TrieNode root;

    public Trie(){
        root = new TrieNode();
    }
    
    class TrieNode {
        TrieNode[] arr;
        boolean isEnd;
        public TrieNode() {
            this.arr = new TrieNode[26];
        }

    }
}

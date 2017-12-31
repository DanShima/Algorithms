package com.danshima;

/**
 * Good for dictionary
 * searching contact in mobile phone book
 * word games (connect letters horizontally, vertically or diagonally) <-- checking a sequence
 * requires much more memory than trees and lists.
 *
 */

public class Trie {
    static TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    static class TrieNode {
        //Each trie node can only contains 'a'-'z' characters thus use a small array to store the character.
        private TrieNode[] children;
        private boolean isEndOfWord;
        private int length;
        public TrieNode() {
            this.children = new TrieNode[26]; //alphabet size is 26
            length = 0;
        }

        public void setChild(char letter, TrieNode node){
            children[letter] = node;
            length++;
        }
        public int getLength(){
            return length;
        }

    }

    //inserts a word into the trie
    public static void insert(String word) {
        TrieNode p = root;
        for(int i = 0; i < word.length(); i++){
            int index = word.charAt(i) - 'a';
            if(p.children[index] == null) {
                TrieNode temp = new TrieNode();
                p.children[index] = temp;
                p = temp;
            }else{
                p = p.children[index];
            }
        }
        p.isEndOfWord = true;
    }



    //returns if a the word is in the trie
    public static boolean search(String word){
        TrieNode enteredWord = searchNode(word);
        if(enteredWord == null){
            return false;
        } else {
            if(enteredWord.isEndOfWord){
                return true;
            }
        }
        return false;
    }
    public static TrieNode searchNode(String searchWord){
        TrieNode wordArray = root;
        for(int i = 0; i < searchWord.length(); i++){
            int index = searchWord.charAt(i) - 'a';
            if(wordArray.children[index] != null){
                wordArray = wordArray.children[index];
            } else {
                return null;
            }
        }
        if (wordArray == root){
            return null;

        }
        return wordArray;
    }




    public static void main(String args[])
    {
        // Input keys (use only 'a' through 'z' and lower case)
        String keys[] = {"thaw", "a", "there", "answer", "any",
                "by", "bye", "their"};

        String output[] = {"Not present in trie", "Present in trie"};


        root = new TrieNode();

        // Construct trie
        int i;
        for (i = 0; i < keys.length ; i++)
            insert(keys[i]);

        // Search for different keys
        if(search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);

        if(search("these") == true)
            System.out.println("these --- " + output[1]);
        else System.out.println("these --- " + output[0]);

        if(search("their") == true)
            System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);

        if(search("thaw") == true)
            System.out.println("thaw --- " + output[1]);
        else System.out.println("thaw --- " + output[0]);

    }
}

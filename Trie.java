class Trie {

    /** Initialize your data structure here. */
    
    static class Node{
        HashMap<Character, Node> hm;
        boolean isComplete;
        public Node(){
            hm = new HashMap<>();
            isComplete = false;
        }
    }
    
    Node root;
    
    public Trie() {
        root = new Node();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node curr = root;
        char c[] = word.toCharArray();
        for(int i=0;i<c.length;i++){
            Node temp = curr.hm.get(c[i]);
            if(temp==null){
                temp = new Node();
                curr.hm.put(c[i],temp);
            }
            curr = temp;
        }
        curr.isComplete = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        char c[] = word.toCharArray();
        Node curr = root;
        for(int i=0;i<c.length;i++){
            Node temp = curr.hm.get(c[i]);
            if(temp==null){
                return false;
            }
            curr=temp;
        }
        return curr.isComplete;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        char c[] = prefix.toCharArray();
        Node curr = root;
        for(int i=0;i<c.length;i++){
            Node temp = curr.hm.get(c[i]);
            if(temp==null){
                return false;
            }
            curr=temp;
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

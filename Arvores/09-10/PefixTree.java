import java.util.HashMap;

public class Node {
    private HashMap<Node> next = new HashMap<>(); 
    private char value;
    public Node(char n) {
        value = n;
        next = new HashMap<>();

    }

}

public class PrefixTree {
    private Node root;
    public boolean isWord;

    public PrefixTree() {
        root = new Node('*');
    }

    public void add(String s) {
        add0(s, root);
    }
    public void add0(String s, Node n) {
        
    }

    private boolean contains0(String s , Node n) {
        if(s.isEmpty()) {
            if(n.isWord == true) return true;
            return false;
        }
        char c = s.charAt(0);
        Nodo next = n.next.get(c);
        if(next == null) return false;
        contains0(s.substring(1), next);
    }

    public boolean contains(String s) {

        if(s == null) {
            return false;
        }
        if(s.isEmpty()) {
            return false;
        }
        contains0(s, root);
    }

    public String toString() {

    }

    public void toString0(){

    }
}
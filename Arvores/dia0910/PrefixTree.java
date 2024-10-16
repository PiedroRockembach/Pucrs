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
            if(n.isWord() == true) return true;
            return false;
        }
        char c = s.charAt(0);
        Node next = n.next.get(c);
        if(next == null) return false;
        return contains0(s.substring(1), next);
    }

    public boolean contains(String s) {

        if(s == null) {
            return false;
        }
        if(s.isEmpty()) {
            return false;
        }
        return contains0(s, root);
    }

    public String toString() {
        return "";
    }

    public void toString0(){

    }
}
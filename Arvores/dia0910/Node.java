import java.util.HashMap;

public class Node {
    public HashMap<Character, Node> next = new HashMap<>(); 
    private char value;
    private boolean isWord;
    public boolean isWord() { return isWord; }
    public Node(char n) {
        value = n;
        next = new HashMap<>();
        isWord = false;
    }

}
import java.util.ArrayList;
import java.util.List;

class Node {
    Node left;
    Node right;
    int value;
    Node(int value) {   
        this.value = value;
        this.left = null;
        this.left = null;
    }  
}

public class BinarySearchTree {
    
    private Node root;
    BinarySearchTree() {

    }
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int teste = 1;
    
        tree.add(10);
        tree.add(8);
        tree.add(11);
        test(
            "1. Deve retornar uma lista com os valores certos",
            "lista: [8, 10, 11]",
            tree.toString()
            );
    }
    public static void test(String title, String expected, int value) {
        System.out.println();
        System.out.println(title);
        System.out.println("valor esperado:");
        System.out.println("    " + expected);
        System.out.println("valor recebido:");
        System.out.println("    " + value);
    }
      public static void test(String title, String expected, String value) {
        System.out.println();
        System.out.println(title);
        System.out.println("valor esperado:");
        System.out.println("    " + expected);
        System.out.println("valor recebido:");
        System.out.println("    " + value);
    }
    public Node add0(Node n, int value) {
        if(n == null) {
            n = new Node(value);
            System.out.println(n.value);
            return null;
        }
        if(n.value > value) {
            n.left = add0(n.left, value);
            System.out.println(n.left.value);
        }
        else if(n.value < value){
            n.right = add0(n.right, value);
            System.out.println(n.right.value);
        };
        return n;
    }
    public void add(int value) {
        root = add0(root, value);
        
    }
    public void toString0(Node n, ArrayList<Integer> values) {
        if(n == null) return;
        toString0(n.left, values);
        values.add(n.value);
        toString0(n.right, values);
    }
    @Override
    public String toString(){
        ArrayList
        <Integer> values = new ArrayList<Integer>();
        toString0(root, values);
        return values.toString();
    }
}
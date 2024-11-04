import java.util.ArrayList;
import java.util.List;

class Node {
    int value;
    int height;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.height = 0;
        this.left = null;
        this.right = null;
    }
    public void rotateRight(){
        
    }
    
    public void rotateLeft(){

    }
}

public class AvlTree {

    private Node root;

    public AVL() {
        root = null;
    }

    public void add(final int v) {
        root = add0(v, root);
    }

    private int h(Node n) {
        if (n == null)
            return -1;
        return n.height;
    }

    private Node add0(int v, Node n) {
        if (n == null) {
            Node newNode = new Node(v);
            return newNode;
        }

        if (n.value < v) {
            n.right = add0(v, n.right);
            // Está equilibrada?
            if (h(n.right) - h(n.left) >= 2) {
                System.out.println("Desequilibrada!");
                if(n.right.value > v) {
                    //arruma a rotação dupla
                    Node filho = n.right;
                    Node neto = filho.left;
                    filho.left = neto.right;
                    neto.right = filho;
                    n.right = neto;
                    filho.height = h(filho.left) > h(filho.right) ? h(filho.left) + 1 : h(filho.right) + 1;
                    neto.height = h(neto.left) > h(neto.right) ? h(neto.left) + 1 : h(neto.right) + 1;
                    n.height = h(n.left) > h(n.right) ? h(n.left) + 1 : h(n.right) + 1;
                }

                // equilibra a arvore
                Node x = n.right;
                Node y = x.right;
                x.right = y.left;
                y.left = x;
                x.height = Math.max(h(x.left), h(x.right)) + 1;
                y.height = Math.max(h(y.left), h(y.right)) + 1;
                return y;
            }
            n.height = Math.max(h(n.left), h(n.right)) + 1;
            
        } else if (n.value > v) {
            n.left = add0(v, n.left);
            // Está equilibrada?            
            if (h(n.left) - h(n.right) >= 2) {
                System.out.println("Desequilibrada!");
            }            
            n.height = Math.max(h(n.left), h(n.right)) + 1;
            //n.height = h(n.left) > h(n.right) ? h(n.left) + 1 : h(n.right) + 1;
        }

        return n;
    }

    public boolean contains(int v) {
        return contains0(v, root);
    }

    private boolean contains0(int v, Node n) {
        if (n == null)
            return false;
        if (n.value < v)
            return contains0(v, n.right);
        else if (n.value > v)
            return contains0(v, n.left);
        else
            return true;
    }

    @Override
    public String toString() {
        List<String> vs = new ArrayList<>();
        toString0(root, vs);
        return vs.toString();
    }

    private void toString0(Node n, List<String> vs) {
        if (n == null)
            return;
        toString0(n.left, vs);
        vs.add(String.format("%d (h=%d)", n.value, n.height));
        toString0(n.right, vs);
    }

    public static void main(String[] args) {
        System.out.println("Binary Search Tree");

        AVL t1 = new AVL();
        System.out.println(t1);
        t1.add(10);
        System.out.println(t1);
        t1.add(30);
        System.out.println(t1);
        t1.add(20);
        System.out.println(t1);
    }

}
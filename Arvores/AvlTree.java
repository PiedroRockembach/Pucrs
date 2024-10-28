class Node {
    Node right;
    Node left;
    int value;
    int height;
    Node(int value) { 
        this.value = value;
    }

    void rotateRight(){

    }
    void rotateLeft(){

    }
}

public class AvlTree{
    Node root;

    Node add0(Node n , int value){
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
    void add(int value) {

    }
    
}
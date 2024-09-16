package dia_16_09;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}
public class ListLinked implements IListable{
    Node head;

    public ListLinked() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addValue(int value) {
        Node newNode = new Node(value);
        if(isEmpty()) {
            this.head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int getValueAt(int index) {
        int i = 0;
        if(isEmpty()) {
            throw new IllegalStateException("A lista esta vazia");
        } 

        Node currentNode = head.next;
        while(currentNode.next != null) {
            if(i == index) {
                return currentNode.value;
            }
            i++;
        }
        throw new IllegalStateException("Indice inválido");
    }

    @Override
    public void setValueAt(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setValueAt'");
    }

    @Override
    public void addValueAt(int index, int value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addValueAt'");
    }
}

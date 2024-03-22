package lista2;

public class Pilha {
    Node top;

    public Pilha() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        int data = top.value;
        top = top.next;
        return data;
    }
}

package pilha;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Pilha {
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
        int data = top.data;
        top = top.next;
        return data;
    }
}

public class ex1 {
    public static int evalPostfix(String[] expression) {
        Pilha stack = new Pilha();

        for (String token : expression) {
            if (token.matches("\\d+")) { // Se o token for um número
                stack.push(Integer.parseInt(token));
            } else { // Se o token for um operador
                int operand2 = stack.pop(); // Desempilha os dois últimos números
                int operand1 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(operand1 + operand2); // Aplica a operação e empilha o resultado
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }

        return stack.pop(); // O resultado final estará no topo da pilha
    }

    public static void main(String[] args) {
        // Testando a função com os exemplos fornecidos
        String[] exp1 = {"2", "1", "+", "3", "*"};
        System.out.println(evalPostfix(exp1)); // Saída: 9

        String[] exp2 = {"4", "13", "5", "/", "+"};
        System.out.println(evalPostfix(exp2)); // Saída: 6
    }
}

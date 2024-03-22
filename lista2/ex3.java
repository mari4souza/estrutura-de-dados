// Avaliação de Expressão Pós-fixa
// Utilize uma pilha para avaliar uma expressão em notação pós-fixa(também conhecida como notação polonesa reversa).
// Escreva uma função que recebe uma expressão em notação pós-fixa como uma lista de strings, onde cada string pode ser um 
// operando (número) ou um operador (+, -, *, /).
// Exemplo: Entrada: ["2", "1", "+", "3", "*"], Saída: 9 (equivalente à expressão (2 + 1) * 3)

package lista2;

public class ex3 {
    private Node top;

    public void push(int dado) {
        Node newNode = new Node(dado);
        newNode.next = top;
        top = newNode;
    }
}

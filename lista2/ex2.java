// Reverso de uma String
// Utilize uma pilha para inverter uma string.

package lista2;

public class ex2 { // Pilha
    private Node top;

    public ex2() { // Construtor
        this.top = null;
    }

    // Metodo para adicionar elemento no topo da pilha
    public void push(int dado) {
        Node newNode = new Node(dado); // Elemento que será adicionado ao topo da pilha
        newNode.next = top; // configura a referencia next do novo nó para apontar para o nó que atualmente está no topo da pilha. Isso conecta o novo nó ao resto da pilha.
        top = newNode; // Atualiza a variável top para apontar para o novo nó. Agora, o novo nó é o elemento mais recente adicionado à pilha e está no topo.
    }
    // Em resumo, o método push cria um novo nó com o valor fornecido, conecta esse nó ao nó que está atualmente no topo da pilha e, em seguida, atualiza a referência top 
    // para apontar para o novo nó, colocando-o no topo da pilha. Este método é comumente usado em implementações de pilhas usando listas encadeadas para adicionar elementos ao topo da pilha.

    public static void main(String[] args) {
        // Exemplo de uso
        ex2 minhaPilha = new ex2();
        String original = "Hello, World!";
        String invertida = minhaPilha.inverterString(original);

        System.out.println("String Original: " + original);
        System.out.println("String Invertida: " + invertida);
    }

    // Método para inverter uma string usando a pilha
    public String inverterString(String input) {

        // Adiciona cada caractere da string à pilha
        for (char c : input.toCharArray()) {  // convertendo a string de entrada em um array de caracteres
            push(c); // percorre cada caractere do array e utiliza o método push para adicionar esse caractere à pilha.
        }

        // Constrói a string invertida desempilhando os caracteres da pilha
        StringBuilder stringInvertida = new StringBuilder();
        while (top != null) {
            stringInvertida.append((char) top.value);
            top = top.next;
        }

        // Retorna a string invertida
        return stringInvertida.toString();
    }
}

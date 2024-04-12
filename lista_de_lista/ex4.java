package lista_de_lista;

class No {
    int dado;
    No anterior;
    No proximo;

    public No(int dado) {
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }
}

class ListaDuplamenteEncadeada {
    No cabeca;

    // Função para inserir um nó no final da lista duplamente encadeada
    public void inserir(int dado) {
        No novoNo = new No(dado);
        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            No temp = cabeca;
            while (temp.proximo != null) {
                temp = temp.proximo;
            }
            temp.proximo = novoNo;
            novoNo.anterior = temp;
        }
    }

    // Função para mesclar duas listas duplamente encadeadas ordenadas
    public static No mesclarListas(ListaDuplamenteEncadeada lista1, ListaDuplamenteEncadeada lista2) {
        if (lista1 == null) {
            return lista2.cabeca;
        }
        if (lista2 == null) {
            return lista1.cabeca;
        }

        No cabeca1 = lista1.cabeca;
        No cabeca2 = lista2.cabeca;

        // Encontrar o último nó da primeira lista
        while (cabeca1.proximo != null) {
            cabeca1 = cabeca1.proximo;
        }

        // Ligar o último nó da primeira lista ao primeiro nó da segunda lista
        cabeca1.proximo = cabeca2;
        cabeca2.anterior = cabeca1;

        return lista1.cabeca;
    }

    // Função para imprimir a lista duplamente encadeada
    public void imprimirLista() {
        No temp = cabeca;
        while (temp != null) {
            System.out.print(temp.dado + " ");
            temp = temp.proximo;
        }
        System.out.println();
    }
}

public class ex4 {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista1 = new ListaDuplamenteEncadeada();
        lista1.inserir(1);
        lista1.inserir(9);
        lista1.inserir(7);

        ListaDuplamenteEncadeada lista2 = new ListaDuplamenteEncadeada();
        lista2.inserir(5);
        lista2.inserir(2);
        lista2.inserir(11);

        System.out.println("Lista 1:");
        lista1.imprimirLista();
        System.out.println("Lista 2:");
        lista2.imprimirLista();

        No cabecaMesclada = ListaDuplamenteEncadeada.mesclarListas(lista1, lista2);
        ListaDuplamenteEncadeada listaMesclada = new ListaDuplamenteEncadeada();
        listaMesclada.cabeca = cabecaMesclada;

        System.out.println("Lista Mesclada:");
        listaMesclada.imprimirLista();
    }
}

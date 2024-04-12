package lista_de_lista;

class No {
    int dado;
    No proximo;

    public No(int dado) {
        this.dado = dado;
        this.proximo = null;
    }
}

class ListaCircular {
    No cabeca;

    // Função para inserir um nó no final da lista circular
    public void inserir(int dado) {
        No novoNo = new No(dado);
        if (cabeca == null) {
            cabeca = novoNo;
            novoNo.proximo = cabeca;
        } else {
            No temp = cabeca;
            while (temp.proximo != cabeca) {
                temp = temp.proximo;
            }
            temp.proximo = novoNo;
            novoNo.proximo = cabeca;
        }
    }

    // Função para rotacionar a lista para a direita por k posições
    public void rotacionar(int k) {
        if (cabeca == null || k <= 0) {
            return;
        }

        // Encontrar o tamanho da lista
        int tamanho = 1;
        No cauda = cabeca;
        while (cauda.proximo != cabeca) {
            tamanho++;
            cauda = cauda.proximo;
        }

        // Ajustar k para um valor efetivo de rotação
        k = k % tamanho;

        // Se k for 0, não há necessidade de rotação
        if (k == 0) {
            return;
        }

        // Encontrar o novo ponto de cabeça e o novo ponto de cauda
        No novaCabeca = cabeca;
        for (int i = 0; i < tamanho - k - 1; i++) {
            novaCabeca = novaCabeca.proximo;
        }
        No novaCauda = novaCabeca;
        while (novaCauda.proximo != cabeca) {
            novaCauda = novaCauda.proximo;
        }

        // Atualizar os ponteiros para refletir a rotação
        novaCauda.proximo = cabeca;
        cabeca = novaCabeca.proximo;
        novaCabeca.proximo = null;
    }

    // Função para imprimir a lista circular
    public void imprimirLista() {
        if (cabeca == null) {
            return;
        }
        No temp = cabeca;
        do {
            System.out.print(temp.dado + " ");
            temp = temp.proximo;
        } while (temp != cabeca);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.inserir(4);
        lista.inserir(5);

        System.out.println("Lista circular:");
        lista.imprimirLista();

        int k = 2;
        lista.rotacionar(k);

        System.out.println("Lista circular após rotação por " + k + " posições:");
        lista.imprimirLista();
    }
}

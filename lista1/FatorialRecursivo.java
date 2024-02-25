package lista1;

public class FatorialRecursivo {
    public static void main(String[] args) {
        int numero = 4;
        int resultado = fatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }

    public static int fatorial( int n) {
        if (n <= 1) { // Fatorial 1 ao final, vai retornar um, e esse valor vai ser substituido nas chamadas de funcao anteriores
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}

//Entendendo a Recursividade no codigo

//Chamada da Função fatorial(4):

//Como n é igual a 4, a condição if (n <= 1) não é satisfeita. A função retorna 4 * fatorial(3). Chamada da Função fatorial(3):

//n é 3, e a função retorna 3 * fatorial(2). Chamada da Função fatorial(2):

//n é 2, e a função retorna 2 * fatorial(1). Chamada da Função fatorial(1):

//Agora, a condição if (n <= 1) é verdadeira. A função retorna 1. Agora, as chamadas recursivas começam a ser resolvidas:

//fatorial(1) retorna 1.
//fatorial(2) retorna 2 * fatorial(1), que é 2 * 1 = 2.
//fatorial(3) retorna 3 * fatorial(2), que é 3 * 2 = 6.
//fatorial(4) retorna 4 * fatorial(3), que é 4 * 6 = 24.


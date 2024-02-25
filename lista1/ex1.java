// Escreva uma função recursiva que recebe um número inteiro positivo n e retorna a soma de todos os números inteiros de 1 até n.

package lista1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();

        // Verifica se o número é positivo
        if (n < 1) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {
            int resultado = somaRecursiva(n); // Inicializando a recursividade
            System.out.println("A soma dos números de 1 até " + n + " é: " + resultado);
        }

        scanner.close();
    }

    public static int somaRecursiva(int n) {
        // Caso base: se n for 1, retorna 1
        if (n == 1) {
            return 1;
        } else {
            // Chamada recursiva: soma o número atual (n) com a soma dos números de 1 até n-1
            return n + somaRecursiva(n - 1);
        }
    }
}

// Por exemplo: n = 4
// 4 + somaRecursiva(3) 
// 3 + somaRecursiva(2) 
// 2 + somaRecursiva(1)
// somaRecursiva(1) = 1

// 2 + somaRecursiva(1) = 3
// 3 + somaRecursiva(2) = 6
// 4 + somaRecursiva(3) = 10

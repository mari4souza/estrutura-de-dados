// Implemente uma função recursiva que calcula x elevado à potência de y, onde x é um número real e y é um inteiro não negativo.
package lista1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro número");
        double x = scanner.nextDouble();

        System.out.println("Segundo número");
        int y = scanner.nextInt();

        double resultado = calcularPotencia(x, y);

        System.out.println(x + " elevado à potência de " + y + " é igual a: " + resultado);

        scanner.close();
    }

    // Funcao recursiva p calcular x elevado a otencia de y
    public static double calcularPotencia(double x, int y) {
        if (y == 0) {
            return 1.0; 
        } else {
            return x * calcularPotencia(x, y-1); // Caso recursivo: x^y = x * x^(y-1)
        }
    }
}

// Entendendo a recursividade
// exemplo: x = 2 e y = 3 ==> 2 * calcularPotencia(2, 2) 

// agora x = 2 e y = 2 ==> 2 * calcularPotencia(2, 1)

// agora x = 2 e y = 1 ==> 2 * calcularPotencia(2, 0) é chamada final (quando y==0) retorna 1

// a ultima expressao calcularPotencia(2, 0) retorna 1, portanto 2 * 1 = 2
// 2 * 2 = 4
// 2 * 4 = 8

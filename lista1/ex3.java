// Fibonacci, é uma serie de numeros ponde cada numero é a soma dos dois números anteriores
// portanto, 0, 1, 1, 2, 3, 5, 8, 13...
package lista1;

public class ex3 {
    public static void main(String[] args) {
        int n = 6; // Exemplo para calcular o quinto numero da sequencia de fibonacci
        int resultado = fib(n);
        System.out.println(resultado);
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0; // Caso base 1: fib(0) = 0
        } else if(n == 1) {
            return 1; // Caso base 2: fib(1) = 1
        } else {
            return fib(n - 1) + fib(n - 2); // Passo recursivo: fib(n) = fib(n-1) + fib(n-2)
        }
    }
}

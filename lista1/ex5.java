// Escreva uma funcao recursiva em java que verifica se determinada string é um palindromo
// A função deve ignorar espaços, pontuacoes e diuferencas entre maiusculas e minusculas
// A função deve retornar True se a string for um palíndromo e False caso contrário
// Não utilize funções prontas da linguagem que façam a inversão da string ou comparações diretas de sub-strings

package lista1;

public class ex5 {

    public static void main(String[] args) {
        String input = "arara";
        boolean result = verificarPalindromo(input);
        System.out.println(result);
    }

    public static boolean verificarPalindromo(String str) {
        // Converter para minúsculas
        String strLimpa = str.toLowerCase();

        // Verificar se a string é um palíndromo recursivamente
        return verificar(strLimpa);
    }

    private static boolean verificar(String str) {
        // Caso base string vazia ou com um único caractere
        if (str.length() <= 1) {
            return true;
        }

        // Verificar se o primeiro e último caracteres são iguais
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        // Chamada recursiva
        return verificar(str.substring(1, str.length() - 1));
    }
}

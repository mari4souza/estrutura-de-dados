// Validador de Parênteses
// Utilize uma pilha para verificar se uma string contendo apenas parênteses ( e ) está balanceada. Retorna true ou false.
// Uma string está balanceada se cada parêntese aberto é seguido por um parêntese fechado correspondente na ordem correta.

package lista2;

public class ex1 {
    public static boolean validar(String expressao) {
        Pilha pilha = new Pilha();
        
        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);
            
            if (caractere == '(') {
                pilha.push(caractere);
            } else if (caractere == ')') {
                try {
                    pilha.pop();
                } catch (IllegalStateException e) {
                    // Se tentarmos fazer pop de uma pilha vazia, significa que há um ')' sem correspondente '('
                    return false;
                }
            }
        }
        
        // A expressão está balanceada se a pilha estiver vazia
        return pilha.isEmpty();
    }

    public static void main(String[] args) {
        String expressao1 = "()()()"; // Expressão balanceada
        String expressao2 = "(()))("; // Expressão não balanceada
        
        System.out.println("Expressão 1 está balanceada? " + validar(expressao1));
        System.out.println("Expressão 2 está balanceada? " + validar(expressao2));
    }
}

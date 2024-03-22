package pilha;

public class ex1 {
    public static int evalPostfix(String[] expression) {
        Pilha stack = new Pilha();

        for (String token : expression) {
            if (token.matches("\\d+")) { // Se o token for um número
                stack.push(Integer.parseInt(token));
            } else { // Se o token for um operador
                int operand2 = stack.pop(); // Desempilha os dois últimos números
                int operand1 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(operand1 + operand2); // Aplica a operação e empilha o resultado
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }

        return stack.pop(); // O resultado final estará no topo da pilha
    }

    public static void main(String[] args) {
        // Testando a função com os exemplos
        String[] exp1 = { "2", "1", "+", "3", "*" };
        System.out.println(evalPostfix(exp1)); // Saída: 9

        String[] exp2 = { "4", "13", "5", "/", "+" };
        System.out.println(evalPostfix(exp2)); // Saída: 6
    }
}

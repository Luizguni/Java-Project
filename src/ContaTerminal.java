// Importa a classe Scanner, usada para ler entradas do usuário via terminal
import java.util.Scanner;

// Declaração da classe principal ContaTerminal
public class ContaTerminal {

    // Método principal - ponto de entrada do programa
    public static void main(String[] args) {

        // Cria um objeto Scanner para capturar a entrada do usuário no terminal
        Scanner scanner = new Scanner(System.in);

        // Solicita o número da conta ao usuário
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt(); // Lê o número digitado e armazena na variável numeroConta

        // Solicita a senha ao usuário
        System.out.println("Por favor, digite a senha: ");
        int senha = scanner.nextInt(); // Lê a senha digitada e armazena na variável senha

        // Exibe uma saudação e os dados informados pelo usuário
        System.out.println("Olá, seja bem-vindo ao nosso banco!");
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Senha: " + senha); // Em um sistema real, não exibiríamos a senha por segurança

        // Simula a exibição de um extrato bancário com dados fictícios
        System.out.println("Extrato Bancário:");
        System.out.println("Seu saldo é de: R$ 8.500,00");
        System.out.println("Última movimentação: R$ 2.500,00");
        System.out.println("Data da última movimentação: 15/04/2025");
        System.out.println("Tipo da última movimentação: Saque");
        System.out.println("Valor Disponível: R$ 6.000,00");

        // Fecha o scanner para liberar recursos do sistema
        scanner.close();
    }
}

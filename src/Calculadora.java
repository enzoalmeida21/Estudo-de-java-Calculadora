
import java.sql.SQLOutput;
import java.util.Scanner;
public class Calculadora {
    public static void main (String[] args){
        // Utilizado para interagir com o usuário ou ler dados de um arquivo!
        Scanner scanner = new Scanner(System.in);
        // executa uma condição que encerra a calculadora após o resultado
        boolean executar = true;

        // Utilizado para printar algo no console!
        System.out.println("Bem vindo à Calculadora!");

        // Loop inifinito (rodará eternamente no codigo ate ser interrompido)
        while (executar) {

            // Criando variável do primeiro numero através da entrada do user
            System.out.println("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            // Criando variável do segundo numero através da entrada do user
            System.out.println("Digite o seungo número: ");
            double numero2 = scanner.nextDouble();

            // Conscientizando o usuário sobre as operações realizáveis
            System.out.println("Escolha uma operação: ");
            System.out.println("1. Soma (+)");
            System.out.println("2. Subtração (-)");
            System.out.println("3. Multiplicação (*)");
            System.out.println("4. Divisão (/)");
            System.out.println("0. Sair");

            // Entrando com a informação do user na calculadora
            System.out.println("Opção: ");
            int opcao = scanner.nextInt();

            double resultado;

            switch (opcao) {
                case 1:
                    resultado = numero1 + numero2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 2:
                    resultado = numero1 - numero2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 3:
                    resultado = numero1 * numero2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 4:
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 0:
                    System.out.println("Calculadora encerrada");
                    executar = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 20;
        int quantidadeMaiores = 0;

/* int i significa que a variável i é um número inteiro (do tipo int)
Ela é usada como um contador no laço for

int i = 1; → Inicializa i com 1 (primeira pessoa).
i <= totalPessoas; → Enquanto i for menor ou igual a totalPessoas (20), o laço continua.
i++ → Após cada repetição, i aumenta em 1 (vai para a próxima pessoa).
Isso faz o laço repetir 20 vezes, pedindo a idade de cada pessoa.
 */

        for (int i = 1; i<= totalPessoas; i++) {
            System.out.println("Informe a idade da pessoa " + i + ":");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                quantidadeMaiores++;
            }
        }


        scanner.close();

        System.out.println("Total de pessoas maiores de idade: " + quantidadeMaiores);

    }
}

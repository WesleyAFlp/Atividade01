import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== CAIXA ELETRÔNICO ===");
        System.out.println("Digite o valor a ser sacado (somente valor inteiro): ");
        int valorSaque = sc.nextInt();
         // Armazenando valores das cédulas
        int[] cedulas = {100, 50, 20, 10, 5};
        int[] quantidadeCedulas = new int[cedulas.length];

        // Contando as cédulas
        for (int i = 0; i < cedulas.length; i++) {
            if (valorSaque >= cedulas[i]) {
                // Quantas cédulas cabem
                quantidadeCedulas[i] = valorSaque / cedulas[i];
                valorSaque %= cedulas[i];
            }
        }

        // Impressão do resultado
        System.out.println("Quantidade mínima de cédulas necessárias:");
        for (int i = 0; i < cedulas.length; i++) {
            if (quantidadeCedulas[i] > 0) {
                System.out.println(quantidadeCedulas[i] + " nota(s) de R$" + cedulas[i] + ",00");
            }
        }
    }
}

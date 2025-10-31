import java.util.Scanner;

public class MaiorMenorDeNNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo(a) ao verificador de maior e menor número entre N números!");

        // Recebendo a quantidade de números para a verificação
        System.out.println("Digite a quantidade de número que deseja: ");
        int n = sc.nextInt();
        int num = 0;
        int maiorNumero = 0;
        int menorNumero = 0;

        // Pegando o primeiro número como parâmetro para verificação
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = sc.nextInt();
        maiorNumero = primeiroNumero;
        menorNumero = primeiroNumero;

        // Verificando maior e menor número
        for (int i = 1; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + " número: ");
            num = sc.nextInt();
            if (num > maiorNumero) {
                maiorNumero = num;
            }else{
                menorNumero = num;
            }
        }
        System.out.println("Maior numero: " + maiorNumero);
        System.out.println("Menor numero: " + menorNumero);
    }
}

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo(a) a calculadora de operações em java!");
        System.out.println("Digite um número: ");
        int num3 = sc.nextInt();
        System.out.println("Digite outro número para subtrai-lo, multiplica-lo e dividi-lo pelo primeiro: ");
        int num4 = sc.nextInt();
        int subtracao = num3 - num4;
        int multiplicacao = num3 * num4;
        int divisao = num3 / num4;
        System.out.println("O resultado da subtração é: " + subtracao);
        System.out.println("O resultado da multiplicação é: " + multiplicacao);
        System.out.println("O resultado da divisão é: " + divisao);
        sc.close();
    }
}

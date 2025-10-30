import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo(a) a calculadora em java!");
        System.out.println("Digite um número: ");
        float num1 = sc.nextFloat();
        System.out.println("Digite o segundo número: ");
        float num2 = sc.nextFloat();
        System.out.println("Digite a operação desejada:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n ");
        int op = sc.nextInt();
        switch(op) {
            case 1:
                float soma = num1 + num2;
                System.out.println("Soma: " + soma); break;
            case 2:
                float subtracao = num1 - num2;
                System.out.println("Subtração: " + subtracao); break;
            case 3:
                float multiplicacao = num1 * num2;
                System.out.println("Multiplicação: " + multiplicacao); break;
            default:
                float divisao = num1 / num2;
                System.out.println("Divisão: " + divisao); break;

        }
    }
}

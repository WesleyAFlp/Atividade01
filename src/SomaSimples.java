import java.util.Scanner;
public class SomaSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo(a) a calculadora em java!");
        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite outro número para somá-lo ao primeiro: ");
        int num2 = sc.nextInt();
        int soma = num1 + num2;
        System.out.println("O resultado da soma é: " + soma);
        sc.close();
    }
}

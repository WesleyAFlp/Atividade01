import java.util.Scanner;

public class PotenciaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bem vindo(a) a calculadora de potências!");
        System.out.println("Digite o denominador: ");
        int denominador = sc.nextInt();
        System.out.println("Digite a potência: ");
        int potencia = sc.nextInt();
        int resultado = 1;
        for (int i = 1; i <= potencia; i++) {
            resultado = resultado * denominador;
        }
        System.out.println("O resultado é: " + resultado);
    }
}

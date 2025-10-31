import java.util.Scanner;

public class TabuadaInvertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== GERADOR DE TABUADA INVERTIDA ===");
        System.out.println("Digite um número para saber sua tabuada invertida: ");
        int num = sc.nextInt();
        for (int i = 10; i >= 1; i--) {
            int resultado = num * i;
            System.out.println(num + "x" + i + ": " + resultado);
        }
        System.out.println("TABUADA INVERTIDA COMPLETA");
    }
}
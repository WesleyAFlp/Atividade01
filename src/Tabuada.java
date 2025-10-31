import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== GERADOR DE TABUADA ===");
        System.out.println("Digite um número para saber sua tabuada: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            int resultado = num * i;
            System.out.println(num + "x" + i + ": " + resultado);
        }
        System.out.println("TABUADA COMPLETA");
        sc.close();
    }
}

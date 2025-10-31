import java.util.Scanner;

public class FatorialNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== CALCULADORA DE FATORIAL ===");
        System.out.println("Digite um número para calcular seu fatoria: ");
        int num = sc.nextInt();
        int fatorial= 1;
        for(int i = 1; i <= num; i++){
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial do número " + num + " é: " + fatorial);
    }
}

import java.util.Scanner;

public class Soma1AteN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== CONTADOR AUTOMÁTICO ===");
        System.out.println("Digite um número para ver a soma de todos os números até ele: ");
        int num = sc.nextInt();
        int soma = 0;
        for (int i = 1; i <= num; i++){
            soma = soma + i;
        }
        System.out.println("Resultado: " + soma);
        sc.close();
    }
}

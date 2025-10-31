import java.util.Scanner;

public class NumeroPositivoNegativoZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== VERIFICADOR DE NÚMEROS ===");
            System.out.println("Digite um número inteiro para descobrir se ele é positivo, negativo ou zero: ");
            int num =  sc.nextInt();
            if (num > 0) {
                System.out.println("O número " + num + " é positivo!");
            } else if (num < 0) {
                System.out.println("O número " +  num + " é negativo!");
            }else {
                System.out.println("O número " +  num + " é zero!");
            }
        sc.close();
    }
}

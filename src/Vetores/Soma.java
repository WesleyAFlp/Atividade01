package Vetores;
import java.util.Scanner;
public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== SOMA DE UM VETOR ===");
        int[] numeros = new int[5];
        int soma = 0;
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i+1) + " número: ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }
        System.out.println("A soma dos números do vetor é: " + soma);
        sc.close();
    }
}

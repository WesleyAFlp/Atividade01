package Vetores;

import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + " número: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Vetor invertido:");
        for (int j = numeros.length; j >= 0; j--) {
            System.out.println(numeros[j-1]);
        }
    }
}
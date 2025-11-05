package Vetores;

import java.util.Scanner;

public class NumeroPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("=== VERIFICADOR DE NÚMEROS POSITIVOS ===");
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i+1) + " número: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Números pares:");
        for (int j = 0; j < numeros.length; j++){
            if (numeros[j] % 2 == 0){
                System.out.println(numeros[j]);
            }
        }
    }
}

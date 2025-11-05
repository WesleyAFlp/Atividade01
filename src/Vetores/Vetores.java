package Vetores;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== UNIÃO DE VETORES ===");
        int [] primeiroVetor = new int[5];
        int [] segundoVetor = new int[5];
        int [] terceiroVetor = new int[10];
        System.out.println("Digite 5 número para o primeiro e o segundo vetor," +
                " e o 3 vetor irá armazenar esses valores, começando do primeiro vetor.");
        for (int i = 0; i < primeiroVetor.length; i++){
            System.out.println("Digite o " + (i+1) + " número do primeiro vetor: ");
            primeiroVetor[i] = sc.nextInt();
            terceiroVetor[i] = primeiroVetor[i];
            System.out.println("Digite o " + (i+1) + " número do segundo vetor: ");
            segundoVetor[i] = sc.nextInt();
            terceiroVetor[i+5] = segundoVetor[i];
        }
        System.out.println("Terceiro vetor: ");
        for (int j = 0; j < terceiroVetor.length; j++){
            System.out.println(terceiroVetor[j]);
        }
    }
}

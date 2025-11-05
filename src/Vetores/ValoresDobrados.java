package Vetores;

import java.util.Scanner;

public class ValoresDobrados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== MULTIPLICADOR DE VALORES ===");
        // Criando os vetores
        int [] vetorInicial = new int[5];
        int [] vetorDobrado = new int[5];
        // Armazenando os valores dentro do primeiro vetor
        for(int i = 0; i < vetorInicial.length; i++){
            System.out.println("Digite o " + (i+1) + " número: ");
            vetorInicial[i] = sc.nextInt();
            // Dobrando os valores do primeiro vetor e armazenando no segundo vetor
            vetorDobrado[i] = vetorInicial[i] * 2;
        }
        // Saída de resultado
        System.out.println("Vetor inicial | Vetor dobrado: ");
        for(int j = 0; j < vetorInicial.length; j++){
            System.out.print("["+vetorInicial[j]+"]");
            System.out.print("["+vetorDobrado[j]+"]");
            System.out.println(" ");
        }
    }
}

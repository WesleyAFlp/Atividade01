package Vetores;
import java.util.Scanner;
public class Vetor {
    public static void main(String[] args) {
    System.out.println("=== VETOR DE NÚMEROS INTEIROS ===");
    int[] numeros = new int[5]; // Criando o vetor
    Scanner sc = new Scanner(System.in);
    // Armazenando dados no vetor
    for (int i=0; i < numeros.length; i++){
        System.out.println("Digite o " + (i+1) + " número: ");
        numeros[i] = sc.nextInt();
    }
    // Mostrando os índices do vetor
    System.out.println("Os números digitados foram:");
    for(int j=0; j<numeros.length; j++){
        System.out.println("["+ numeros[j] + "]");
    }
    sc.close();
}
}

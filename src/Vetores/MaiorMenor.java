package Vetores;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        // Criando variáveis Maior e Menor
        int maior = 0;
        int menor = 0;
        // Pegando o primeiro índice do vetor como base para descobrir o maior e o menor número
        System.out.println("Digite o primeiro número: ");
        numeros[0] = sc.nextInt();
        maior = numeros[0];
        menor = numeros[0];
        // Armazenando o segundo índice até o nono
        for (int i = 1; i < numeros.length; i++){
            System.out.println("Digite o " + (i+1) + " número: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] > maior){
                maior = numeros[i];
            } else if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("O maior número é o: " + maior);
        System.out.println("O menor número é o: " + menor);
    }
}

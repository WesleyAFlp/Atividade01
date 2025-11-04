package Vetores;

import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int par = 0;
        int impar = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i+1) + " número inteiro para armazena-lo no vetor: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0){
                par += 1;
            }else{
                impar += 1;
            }
        }
        System.out.println("O vetor possui " + par + " números pares!");
        System.out.println("O vetor possui " + impar + " números ímpares!");
    }
}

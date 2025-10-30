import java.awt.*;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para verificar se ele é par ou ímpar: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("O número "+ num + " é par!");
        }else{
            System.out.println("O número " + num + " é ímpar!");
        }
    }
}

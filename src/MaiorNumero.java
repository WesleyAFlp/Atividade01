import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite outro número para compara-lo ao primeiro: ");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("O número " + num1 + " é maior!");
        }else {
            System.out.println("O número " + num2 + " é maior!");
        }
    }
}
